package Interfaces;

import java.util.Scanner;

public class Console implements UserInterface {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getString(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }

    @Override
    public Integer getInteger(String text) {
        System.out.println(text);
        return scanner.nextInt();
    }

}
