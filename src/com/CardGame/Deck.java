package com.CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Deck {
    private final static String[] SUITS = {"♤", "♥", "♧", "♦"};
    private final static int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (var suit : SUITS) {
            for (var value : VALUES) {
                cards.add(new Card(value, suit));
            }
        }
    }

    // TODO: add constructor that will take a array of suits and values

    public void shuffle() {
        Collections.shuffle(cards);
    }

    // TODO: evaluate if Card object is needed or just the display value
    public Card draw() {
        return cards.remove(cards.size() - 1);
    }

}
