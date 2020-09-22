package com.company;

import com.Game.Console;
import com.Game.Die;
import com.Game.Hand;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        Hand myHand = new Hand(5);

        myHand.roll(rand);

        Console.displayDice(myHand.getDice());

        myHand.roll(rand, Console.getChoices());

        Console.displayDice(myHand.getDice());

        myHand.roll(rand, Console.getChoices());

        Console.displayDice(myHand.getDice());

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
