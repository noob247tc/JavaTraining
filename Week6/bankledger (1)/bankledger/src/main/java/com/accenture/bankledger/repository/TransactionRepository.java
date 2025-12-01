package com.accenture.bankledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.accenture.bankledger.model.entity.Transaction;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountId(Long accountId);
    List<Transaction> findByTransactionType(String transactionType);
    List<Transaction> findByAmountGreaterThan(BigDecimal amount);
    List<Transaction> findByAccountIdAndTransactionType(Long accountId, String transactionType);
}
