package com.accenture.bankledger;

import com.accenture.bankledger.model.entity.Account;
import com.accenture.bankledger.model.entity.Customer;
import com.accenture.bankledger.model.entity.Transaction;
import com.accenture.bankledger.repository.AccountRepository;


import com.accenture.bankledger.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class BankledgerApplication {

	public static void main(String[] args) {

        SpringApplication.run(BankledgerApplication.class, args);
    }

}


