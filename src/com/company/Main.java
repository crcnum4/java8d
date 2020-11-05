package com.company;

import com.Accounts.Account;
import com.Accounts.BankAccount;
import com.Accounts.SavingsAccount;
import com.Bank.Bank;
import com.BankTools.Chaos;
import com.BankTools.Console;
import com.BankTools.UI;
import com.CardGame.Deck;

import javax.swing.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
//        Deck deck = new Deck();
//        deck.shuffle();
//        deck.draw();
//        System.out.print("### ");
//        System.out.print(deck.draw().displayValue() + " ");
//        System.out.print("\n");
//        deck.draw();
//        System.out.print("### ");
//        System.out.print(deck.draw().displayValue() + "\n");
        UI ui = new Console();
        Bank newBank = new Bank("dataBank");
        newBank.addClient("Cliff", "Test");
        newBank.addAccount(100000, "1", "Saving", ui);
        System.out.println(newBank.getClientAccounts("1"));
        BankAccount savingsAccount = newBank.getAccount(1);
        savingsAccount.applyInterest();
        System.out.println(newBank.getClientAccounts("1"));
    }
}
