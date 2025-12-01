package com.accenture.bankledger.model.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_holder_name", nullable = false, length = 100)
    private String accountHolderName;

    @Column(name = "account_type", nullable = false, length = 20)
    private String accountType;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal balance;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Account(){

    }
    public Account(String accountHolderName, String accountType, BigDecimal balance) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    @PrePersist void onCreate(){
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }
    @PreUpdate void onUpdate(){
        updatedAt = LocalDateTime.now();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {

        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {

        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {

        this.accountType = accountType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {

        this.balance = balance;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {

        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString(){
        return "Account{" +
                "id="+ id +
                ", accountHolderName='" + accountHolderName + '\''+
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';

    }

}
