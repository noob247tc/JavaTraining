package com.accenture.bankledger.controller;


import com.accenture.bankledger.model.entity.Product;
import com.accenture.bankledger.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductId(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @GetMapping("/category/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @PutMapping("/{id}/stock/{quantity}")
    public Product addStock(@PathVariable Long id, @PathVariable Integer quantity){
        return productService.addStock(id, quantity);
    }
}
