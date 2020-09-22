package com.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
    private List<Die> dice = new ArrayList<Die>();

    public Hand(int size) {
        for (int count = 0; count < size; count++ ) {
            dice.add(new Die());
        }
    }

    public void roll(Random rand) {
        dice.get(0).roll(rand);
    }

    public List<Die> getDice() {
        return dice;
    }
}
