package com.company;

import com.bank.CheckingAccount;
import com.bank.SavingsAccount;
import com.bank.DebitCard;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CheckingAccount myAcct = new CheckingAccount(1000, 777, "Clifton");
        SavingsAccount mySavings = new SavingsAccount(3500, 12345, "John", 5);
        SavingsAccount wifeSavings = new SavingsAccount(4500, 382749, "Alice", 5);
//        mySavings.withdraw(200);
//        mySavings.deposit(50);
//        mySavings.applyInterest();
        System.out.println(myAcct.accountDetails());
        myAcct.deposit(50);
        System.out.println(myAcct.accountDetails());
        myAcct.withdraw(100);
        System.out.println(myAcct.accountDetails());
//        System.out.println(mySavings.accountDetails());
        List acts = new ArrayList<SavingsAccount>();
        acts.add(mySavings);
        DebitCard myCard = new DebitCard(
                "1234 1234 1234 1122",
                "1234",
                myAcct,
                new ArrayList<SavingsAccount>(Arrays.asList(mySavings, wifeSavings))
        );
        System.out.println(myAcct.accountDetails());
        System.out.println(myCard.charge(100, "1234") ? "Accepted" : "Denied");
        System.out.println(myAcct.accountDetails());
        System.out.println(myCard.charge(500, "3287") ? "Accepted" : "Denied");
        System.out.println(myAcct.accountDetails());
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
