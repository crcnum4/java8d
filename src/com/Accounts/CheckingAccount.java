package com.Accounts;

import com.Bank.Client;

public class CheckingAccount extends BankAccount implements Account {
    public CheckingAccount(int balance, int accountNumber, Client owner){
        super(balance, accountNumber, owner, "Checking");
    }
}
