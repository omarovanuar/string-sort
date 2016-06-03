package com.epam.module3;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        System.out.println("Please, enter number of strings:");
        int number = 0;
        try {
            number = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Please, enter integer number");
            Runner.main(args);
        }
        String[] strings = new String[number];
        Utils.setNumber(number);
        for (int i = 0; i < number; i++) {
            System.out.println("Enter your " + (i + 1) + " string");
            strings[i] = new Scanner(System.in).nextLine();
        }

        Utils.countVowelNumber(strings);

        System.out.println("\nArray with number of vowels:");
        Utils.showArrays(strings);

        System.out.println("\nSorted array by number of vowels:");
        Utils.sortByVowelNumber(strings);
        Utils.showArrays(strings);
    }
}
