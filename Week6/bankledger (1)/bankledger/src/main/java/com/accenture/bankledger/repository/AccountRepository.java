package com.accenture.bankledger.repository;

import com.accenture.bankledger.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByAccountHolderName(String accountHolderName);

    List<Account> findByAccountType(String accountType);

    List<Account> findByBalanceGreaterThan(BigDecimal amount);

    List<Account> findByBalanceLessThan(BigDecimal amount);

    List<Account> findByAccountHolderNameContainingIgnoreCase(String keyword);

}
