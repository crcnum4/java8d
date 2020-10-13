package com.company;

import com.Accounts.CheckingAccount;
import com.Accounts.InvestmentAccount;
import com.Accounts.SavingsAccount;
import com.Bank.Client;
import com.BankTools.DebitCard;
import com.Game.Console;
import com.Game.Die;
import com.Game.Hand;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Client cliff = new Client("Cliff", "Choiniere", "cc4");
        cliff.addAccount(new CheckingAccount(100000, 123456, cliff.getName()));
        cliff.addAccount(new SavingsAccount(5000, 987654, cliff.getName(), 5));
        cliff.addAccount(new InvestmentAccount(200000, 246810, cliff.getName(), 10));
        cliff.addCard(123456);
        System.out.println(cliff.getAccounts());

    }
}
