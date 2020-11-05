package com.BankTools;

import com.Accounts.Account;
import com.Accounts.BankAccount;
import com.Bank.Client;

import java.util.Calendar;
import java.util.List;

// update debit card to connect with client so it has access to an account.

public class DebitCard {
    private String cardNum;
    private String pin;
    private Calendar expDate;
    private BankAccount primary;
    private Client owner;
//    private List<Account> atmAccounts;


    public DebitCard(String cardNum, String pin, BankAccount primary, Client owner) {
        this.cardNum = cardNum;
        this.pin = pin;
        this.primary = primary;
        this.owner = owner;
    }

    public Boolean charge(int amount, String pin) {
        if (this.pin == pin && primary.getBalance() >= amount) {
            primary.withdraw(amount);
            return true;
        }
        return false;
    }

    public int getPrimaryBalance(String pin) {
        if (this.pin == pin) {
            return primary.getBalance();
        }
        return 0;
    }

}
