package com.accenture.bankledgerr.model.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "account_id", nullable = false)
        private Long accountId;
        @Column(name = "transaction_type", nullable = false, length = 20)
        private String transactionType;
        @Column(name = "amount", precision = 15, scale = 2)
        private BigDecimal amount;
        @Column(name = "transaction_date", nullable = false)
        private LocalDateTime transactionDate;
        @Column(name = "description", length = 255)
        private String description;

        public Transaction(){

        }
        public Transaction(Long accountId, String transactionType,
                           BigDecimal amount,
                          String description ){
            this.accountId = accountId;
            this.transactionType = transactionType;
            this.amount = amount;

            this.description = description;

        }

        @PrePersist void onTransactionDate(){
            transactionDate = LocalDateTime.now();
        }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Transaction{"+
                "id="+ id +
                ", accountId='" + accountId + '\''+
                ", transactionType='" + transactionType + '\'' +
                ", balance=" + amount +
                ", createdAt=" + transactionDate +
                ", description=" + description +
                '}';
    }
}
