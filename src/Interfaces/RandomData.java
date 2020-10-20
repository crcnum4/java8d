package Interfaces;

import java.util.Random;

public class RandomData implements UserInterface{
    private Random rand = new Random();


    @Override
    public String getString(String text) {
        String[] options = {"D", "W", "M", "Y", "Q"};
        return options[rand.nextInt(options.length)];
    }

    @Override
    public Integer getInteger(String text) {
        return rand.nextInt(10) + 1;
    }
}
