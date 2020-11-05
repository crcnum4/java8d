package com.Accounts;

import com.Bank.Client;

public abstract class BankAccount {
    protected int balance;
    private int accountNum;
    private Client owner;
    private String type;

    public BankAccount(int balance, int accountNum, Client owner, String type) {
        this.balance = balance;
        this.accountNum = accountNum;
        this.owner = owner;
        this.type = type;
    }

    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
        }
        return;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public String accountDetails() {
        return type + " Account" + "\tOwner: " + owner.getName() + "\tAccount Number: " + accountNum + "\tBalance: " + balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner.getName();
    }

    public int getAccountNum() {
        return accountNum;
    }
}


