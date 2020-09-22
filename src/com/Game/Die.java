package com.Game;

import java.util.List;
import java.util.Random;

public class Die {
    private int sides = 6;
    private int value;

    public Die() {
        this.value = 1;
    }

    public void roll(Random rand) {
        value = rand.nextInt(sides) + 1;
    }

    public int getValue() {
        return value;
    }
}
