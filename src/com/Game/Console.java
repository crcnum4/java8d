package com.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome() {
        System.out.println("Welcome to Yahtzee");
    }

    static public void log(String output) {
        System.out.println(output);
    }

    static public void log(int output) {
        System.out.println(output);
    }

    static public void displayDice(List<Die> dice) {
        System.out.println("---Your Dice---");
        for (var die : dice) {
            System.out.print(die.getValue() + " ");
        }
        System.out.print("\n");
    }

    static public List<Integer> getChoices() {
        System.out.print("Enter dice to reroll 1-5 example 1 2 3: ");
        String input = scanner.nextLine(); // "1 2 3"
        // input error checking for non numbers or no entry
        String[] inputArray = input.split(" "); // [ "1", "2", "3" ]
        List<Integer> choices = new ArrayList<Integer>();
        for (String number : inputArray) {
            choices.add(Integer.parseInt(number) - 1);
        }
        return choices; // < 1, 2, 3 >
    }


}
