package com.Bank;

import com.Accounts.Account;
import com.Accounts.CDInvestment;
import com.Accounts.CheckingAccount;
import com.Accounts.SavingsAccount;
import com.BankTools.DebitCard;

import java.util.ArrayList;
import java.util.List;

public class Client {
    protected String name;
    protected String firstName;
    protected String lastName;
    protected String clientId;
    protected List<Account> accounts;
    protected List<DebitCard> cards;
//    protected List<CheckingAccount> checkingAccounts;
//    protected List<SavingsAccount> savingsAccounts;
//    protected List<CDInvestment> cdAccounts;

    public Client(String firstName, String lastName, String clientId) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientId = clientId;
        accounts = new ArrayList<Account>();
        cards = new ArrayList<DebitCard>();
//        this.checkingAccounts = new ArrayList<CheckingAccount>();
//        this.savingsAccounts = new ArrayList<SavingsAccount>();
//        this.cdAccounts = new ArrayList<CDInvestment>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addCard(int accountNum) {
//        int index = accounts.indexOf()
        /*
        Once found instatiate a card with that account and the client.
        you may need to add a getAccountNum to interface and classes.
         */
    }


//    public void addAccount(CheckingAccount account) {
//        checkingAccounts.add(account);
//    }
//
//    public void addAccount(SavingsAccount account) {
//        savingsAccounts.add(account);
//    }
//
//    public void addAccount(CDInvestment account) {
//        cdAccounts.add(account);
//    }

    public String getName() {
        return name;
    }

    public String getAccounts() {
        String output = "";
        for (var account : accounts ) {
            output += account.accountDetails() + "\n";
        }
        return output;
    }
}
