package com.accenture.bankledger.service;

import com.accenture.bankledger.model.entity.Account;
import com.accenture.bankledger.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

    @Service
    public class AccountService{

        @Autowired
        private AccountRepository accountRepository;

        public Account createAccount(Account account){
            if(account.getAccountHolderName() == null ||
               account.getAccountHolderName().trim().isEmpty()){
                throw new RuntimeException("Account holder name is required!");
            }

        String type = account.getAccountType();
        if(!type.equals("SAVINGS") && ! type.equals("CURRENT")){
            throw new RuntimeException("Account type must be SAVINGS or CURRENT!");
        }
        if(account.getBalance().compareTo(BigDecimal.ZERO) < 0){
            throw new RuntimeException("Balance cannot be negative!");

        }
        return accountRepository.save(account);
        }

    public Account getAccountById(Long id){
            return accountRepository.findById(id).
                    orElseThrow(()-> new RuntimeException("Account not found with id: " + id));
    }
    public List<Account> getAllAccounts(){
            return accountRepository.findAll();
    }
    public List<Account> getAccountsByType(String accountType){
            return accountRepository.findByAccountType(accountType);
    }
    public Account updateAccount(Long id,Account account){
            Account existing = getAccountById(id);
            existing.setAccountHolderName(account.getAccountHolderName());
            existing.setAccountType(account.getAccountType());
            existing.setBalance(account.getBalance());

            return accountRepository.save(existing);
    }
    public void deleteAccount(Long id){
            if(!accountRepository.existsById(id)){
                throw new RuntimeException("Account not found with id: " + id);

            }
    accountRepository.deleteById(id);
    }
    public Account deposit(Long id, BigDecimal amount){
            Account account = getAccountById(id);

            if(amount.compareTo(BigDecimal.ZERO)<=0){
                throw new RuntimeException("Deposit amount must be positive!");
            }
            BigDecimal newBalance = account.getBalance().add(amount);
            account.setBalance(newBalance);
            return accountRepository.save(account);
    }
    public Account withdraw(Long id, BigDecimal amount){
            Account account = getAccountById(id);

            if(amount.compareTo(BigDecimal.ZERO) <= 0){
                throw new RuntimeException("Withdrawal amount must be positive!");

            }
            if(account.getBalance().compareTo(amount) < 0){
                throw new RuntimeException("Not enough money! Balance: " + account.getBalance());
            }
            BigDecimal newBalance = account.getBalance().subtract(amount);
            account.setBalance(newBalance);

            return accountRepository.save(account);
    }
    }

