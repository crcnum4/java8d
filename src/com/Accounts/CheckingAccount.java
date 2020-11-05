package com.Accounts;

import com.Bank.Client;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(int balance, int accountNumber, Client owner){
        super(balance, accountNumber, owner, "Checking");
    }
}
