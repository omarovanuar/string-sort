package com.epam.module3;

import java.util.Scanner;

public class StringArrayFactory {
    private boolean repeat = true;
    private StringArray stringArray;

    public StringArrayFactory() {
        addStringArray();
    }

    public void addStringArray() {
        while (repeat) {
            System.out.println("Please, enter number of strings:");
            try {
                stringArray = new StringArray(new Scanner(System.in).nextInt());
                repeat = false;
            } catch (Exception e) {
                System.out.println("Please, enter integer number");
            }
        }

        for (int i = 0; i < stringArray.getNumber(); i++) {
            System.out.println("Enter your " + (i + 1) + " string");
            stringArray.setString(i, new Scanner(System.in).nextLine());
        }
    }

    public StringArray getStringArray() {
        return stringArray;
    }
}
