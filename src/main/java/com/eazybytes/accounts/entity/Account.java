package com.eazybytes.accounts.entity;

import jakarta.persistence.*;

@Entity
public class Account extends BaseEntity{
    @Id
    private Long accountNumber;
    @Column
    private String accountType;
    @Column
    private String branchAddress;
    @Column
    private Integer customerId;

    public Account() {
    }

    public Account(Long accountNumber, String accountType, String branchAddress, Integer customerId) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.branchAddress = branchAddress;
        this.customerId = customerId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", branchAddress='" + branchAddress + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}
