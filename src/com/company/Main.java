package com.company;

import com.Accounts.CheckingAccount;
import com.Accounts.SavingsAccount;
import com.Bank.Client;
import com.BankTools.DebitCard;
import com.Accounts.CDInvestment;
import com.Accounts.InvestmentAccount;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int num = 4 + 3;
        // write your code here
        CheckingAccount myAcct = new CheckingAccount(1000, 777, "Clifton");
        SavingsAccount mySavings = new SavingsAccount(3500, 12345, "John", 5);
        SavingsAccount wifeSavings = new SavingsAccount(4500, 382749, "Alice", 5);
        System.out.println(myAcct.accountDetails());
        myAcct.deposit(50);
        System.out.println(myAcct.accountDetails());
        myAcct.withdraw(100);
        System.out.println(myAcct.accountDetails());
        List acts = new ArrayList<SavingsAccount>();
        acts.add(mySavings);
        DebitCard myCard = new DebitCard(
                "1234 1234 1234 1122",
                "1234",
                myAcct,
                new ArrayList<SavingsAccount>(Arrays.asList(mySavings, wifeSavings))
        );
//        System.out.println(myAcct.accountDetails());
//        System.out.println(myCard.charge(100, "1234") ? "Accepted" : "Denied");
//        System.out.println(myAcct.accountDetails());
//        System.out.println(myCard.charge(500, "3287") ? "Accepted" : "Denied");
//        System.out.println(myAcct.accountDetails());
        CDInvestment myCD = new CDInvestment(10000, 987654, "Clifton", 2, 'Y');
        InvestmentAccount invAcct = new InvestmentAccount(20000, 65482, "Ava", 5);

        System.out.println(myCD.accountDetails());
        myCD.withdraw(500);
        System.out.println(myCD.accountDetails());
        System.out.println(invAcct.accountDetails());
        invAcct.withdraw(500);
        System.out.println(invAcct.accountDetails());

        Client cliff = new Client("Cliff", "Choiniere", "CC33987");
        cliff.addAccount(myAcct);
        cliff.addAccount(mySavings);
    }
}

// create a Client class
// 2 of your own properties
// listArray of checkingAccounts
// listArray or savingsAccounts
// a way to add an account (try to use overloading) addAccount()

// Bank class
// 2 properties of your own.
// listArray of Clients
