package com.company;

import com.CardGame.Deck;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.draw();
        System.out.print("### ");
        System.out.print(deck.draw().displayValue() + " ");
        System.out.print("\n");
        deck.draw();
        System.out.print("### ");
        System.out.print(deck.draw().displayValue() + "\n");
    }
}
