package com.beatrix.rest;

import javax.persistence.Entity;

@Entity
public class Debt {
    public Long accountNumber;
    public Integer amount;

	public Debt(Long accountNumber, Integer amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public Long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber){
        this.accountNumber = accountNumber;
    }

    public Integer getAmount(){
        return amount;
    }

    public void setAmount(Integer amount){
        this.amount = amount;
    }

}
