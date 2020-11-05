package com.Bank;

import com.Accounts.*;
import com.BankTools.UI;

import java.util.HashMap;
public class Bank {
    private HashMap<String, Client> clients;
    private HashMap<Integer, BankAccount> accounts;
    private Integer clientCount = 0;
    private Integer accountCount = 0;
    private String name;
    // private HashMap<String, Employee> employees;
    private String authCode;
    // private HashMap<Integer, String> authCodes;

    public Bank(String name) {
        this.name = name;
        clients = new HashMap<>();
        accounts = new HashMap<>();
    }

    public void addClient(String fname, String lname) {
        String clientId = (++clientCount).toString();
        clients.put(clientId, new Client(fname, lname, clientId));
//        System.out.println(clientId);
    }

    public void addAccount(int balance, String clientId, String accountType, UI ui) {
        Client client = clients.get(clientId);
        if (client == null) {
            System.out.println("ERROR: Invalid ClientID");
            return;
        }
        int accountNumber = (++accountCount);
        BankAccount newAccount = createAccount(balance, client, accountType, accountNumber, ui);

        accounts.put(accountNumber, newAccount);
        client.addAccount(newAccount);
    }

    private BankAccount createAccount(int balance, Client client, String accountType, int accountNumber, UI ui ) {

        switch (accountType) {
            case "Checking":
                return new CheckingAccount(balance, accountNumber, client);
            case "Saving":
                return new SavingsAccount(balance, accountNumber, client, ui.getInteger("What is the interest?"));
            case "Investment":
                return new InvestmentAccount(balance, accountNumber, client, ui.getInteger("What is the interest rate?"));
            case "CD":
                return new CDInvestment(
                        balance,
                        accountNumber,
                        client,
                        ui.getInteger("What is the Time Frame?"),
                        ui.getString("Enter TimePeriod key")
                );
            default:
                // TODO: throw exception.
                return null;
        }
    }

    public String getClientAccounts(String clientId) {
        return clients.get(clientId).getAccounts();
    }

    public BankAccount getAccount(int accountId) {
        return accounts.get(accountId);
    }
}
