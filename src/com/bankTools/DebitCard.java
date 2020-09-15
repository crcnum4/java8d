package com.bankTools;

import com.bank.CheckingAccount;
import com.bank.SavingsAccount;

import java.util.Calendar;
import java.util.List;

public class DebitCard {
    private String cardNum;
    private String pin;
    private Calendar expDate;
    private CheckingAccount primary;
    private List<SavingsAccount> atmAccounts;

    public DebitCard(String cardNum, String pin, CheckingAccount primary, List atmAccounts) {
        this.cardNum = cardNum;
        this.pin = pin;
//        this.expDate = expDate;
        this.primary = primary;
        this.atmAccounts = atmAccounts;
    }

    ;

    public Boolean charge(int amount, String pin) {
        if (this.pin == pin && primary.getBalance() >= amount) {
            primary.withdraw(amount);
            return true;
        }
        return false;
    }

}
