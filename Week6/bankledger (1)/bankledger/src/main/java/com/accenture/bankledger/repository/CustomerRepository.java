package com.accenture.bankledger.repository;


import com.accenture.bankledger.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

    List<Customer> findByEmail(String email);
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
    List<Customer> findByFirstNameContainingIgnoreCase(String firstName);

}
