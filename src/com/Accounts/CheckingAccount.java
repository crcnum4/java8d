package com.Accounts;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(int balance, int accountNumber, String owner){
        super(balance, accountNumber, owner, "Checking");
    }
}
