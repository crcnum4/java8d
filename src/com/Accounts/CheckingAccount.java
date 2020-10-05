package com.Accounts;

public class CheckingAccount extends BankAccount implements Account {
    public CheckingAccount(int balance, int accountNumber, String owner){
        super(balance, accountNumber, owner, "Checking");
    }
}
