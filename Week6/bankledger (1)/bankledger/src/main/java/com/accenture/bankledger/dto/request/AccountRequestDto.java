/*
package com.accenture.bankledger.dto.request;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class AccountRequestDto {

    @NotBlank(message ="Account holder name is required ")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String accountHolderName;

    @NotBlank(message = "Account type is required")
    @Pattern (regexp = "SAVING CURRENT", message ="Account type must be SAVINGS or CURRENT")
    private String accountType;

    @NotNull(message = "Initial balance is required")
    @DecimalMin(value = "0.0", inclusive = true, message ="Balance cannot be negative")
    private BigDecimal balance;

    public AccountRequestDto(){

    }

    public AccountRequestDto(String accountHolderName, String accountType, BigDecimal balance){
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;

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
}
*/
