package com.epam.module3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        char[] vowel = {'a', 'e', 'y', 'u', 'i', 'o', 'A', 'E', 'Y', 'U', 'I', 'O'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number of strings:");
        int number = scanner.nextInt();
        String[] strings = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter your " + (i + 1) + " string");
            strings[i] = scanner.nextLine();
        }

        int vowelNumber[] = new int[number];
        for (int i = 0; i < number; i++) {
            char[] chars = strings[i].toCharArray();
            int counter = 0;
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < vowel.length; k++) {
                    if (vowel[k] == chars[j]) {
                        counter++;
                    }
                }
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println(strings[i]);
        }

    }
}
