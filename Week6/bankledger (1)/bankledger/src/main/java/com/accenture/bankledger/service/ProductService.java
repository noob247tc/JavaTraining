package com.accenture.bankledger.service;


import com.accenture.bankledger.model.entity.Product;
import com.accenture.bankledger.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){
        if(product.getName().isEmpty() || product.getName() == null){
            throw new RuntimeException("Name is required");
        }
        if(product.getPrice().compareTo(BigDecimal.ZERO) < 0){
            throw new RuntimeException("The price can't be negative ");
        }

        if(product.getStock() < 0){
            throw new RuntimeException("The stock can't be negative");
        }
        return productRepository.save(product);
    }
    public Product getProductById(Long id){
        return productRepository.findById(id).
                orElseThrow(()-> new RuntimeException("Product not found with id: " + id));
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public List<Product> getProductByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public Product updateProduct(Long id, Product product){
        Product existing = getProductById(id);

        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setStock(product.getStock());
        existing.setCategory(product.getCategory());

        return productRepository.save(existing);

    }
    public void deleteProduct(Long id){
        if(!productRepository.existsById(id)){
            throw new RuntimeException("Product not found with id: " + id);
        }
    productRepository.deleteById(id);
    }
    public Product addStock(Long id, Integer quantity){
        Product existing = getProductById(id);

        int newStock = existing.getStock() + quantity;
        existing.setStock(newStock);

        return productRepository.save(existing);
    }
}
