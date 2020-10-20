package com.company;

import Interfaces.Console;
import Interfaces.RandomData;
import Interfaces.UserInterface;
import com.Accounts.CheckingAccount;
import com.Accounts.InvestmentAccount;
import com.Accounts.SavingsAccount;
import com.Bank.Bank;
import com.Bank.Client;
import com.BankTools.DebitCard;
import com.Game.Die;
import com.Game.Hand;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new Console();
        Bank ourBank = new Bank("The DataBank");

        ourBank.addClient("Tom", "Hodgkinson");
        ourBank.addAccount(1000000, "1", "Checking", ui);
        ourBank.addAccount(500000, "1", "Saving", ui);
        System.out.println(ourBank.getClientAccounts("1"));

    }
}
