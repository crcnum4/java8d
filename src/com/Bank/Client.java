package com.Bank;

import com.Accounts.CDInvestment;
import com.Accounts.CheckingAccount;
import com.Accounts.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Client {
    protected String name;
    protected String firstName;
    protected String lastName;
    protected String clientId;
    protected List<CheckingAccount> checkingAccounts;
    protected List<SavingsAccount> savingsAccounts;
    protected List<CDInvestment> cdAccounts;

    public Client(String firstName, String lastName, String clientId) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientId = clientId;
        this.checkingAccounts = new ArrayList<CheckingAccount>();
        this.savingsAccounts = new ArrayList<SavingsAccount>();
        this.cdAccounts = new ArrayList<CDInvestment>();
    }

    public void addAccount(CheckingAccount account) {
        checkingAccounts.add(account);
    }

    public void addAccount(SavingsAccount account) {
        savingsAccounts.add(account);
    }

    public void addAccount(CDInvestment account) {
        cdAccounts.add(account);
    }

}
