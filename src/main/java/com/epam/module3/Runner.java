package com.epam.module3;

import java.util.*;

public class Runner {
    private static final Comparator<Phrase> VOWEL_NUMBER_COMPARATOR = (o1, o2) -> o1.getVowelNumber().compareTo(o2.getVowelNumber());

    public static void main(String[] args) {
        boolean repeat = true;
        List<Phrase> list = new ArrayList<>();
        int number = 0;

        while (repeat) {
            System.out.println("Please, enter number of strings:");
            try {
                number = new Scanner(System.in).nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Please, enter integer number");
            }
        }

        for (int i = 1; i <= number; i++) {
            System.out.println("Enter your " + i + " string");
            list.add(new Phrase(new Scanner(System.in).nextLine()));
        }

        System.out.println("\nArray with number of vowels:");
        list.forEach(System.out::println);

        System.out.println("\nSorted array by number of vowels:");
        Collections.sort(list, VOWEL_NUMBER_COMPARATOR);
        list.forEach(System.out::println);
    }
}
