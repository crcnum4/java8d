package com.company;

import com.bank.CheckingAccount;
import com.bank.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CheckingAccount myAcct = new CheckingAccount(1000, 777, "Clifton");
        SavingsAccount mySavings = new SavingsAccount(3500, 12345, "John", 5);
        mySavings.withdraw(200);
        mySavings.deposit(50);
        mySavings.applyInterest();
        System.out.println(myAcct.accountDetails());
        myAcct.deposit(50);
        System.out.println(myAcct.accountDetails());
        myAcct.withdraw(100);
        System.out.println(myAcct.accountDetails());
        System.out.println(mySavings.accountDetails());
    }
}