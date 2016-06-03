package com.epam.module3;

public class Utils {
    private static final char[] vowel = {'a', 'e', 'y', 'u', 'i', 'o', 'A', 'E', 'Y', 'U', 'I', 'O'};
    private static int number;
    private static int vowelNumber[];

    public static void setNumber(int number) {
        Utils.number = number;
        Utils.vowelNumber = new int[number];
    }

    public static void countVowelNumber(String[] strings) {
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
            vowelNumber[i] = counter;
        }
    }

    public static void showArrays(String[] strings) {
        for (int i = 0; i < number; i++) {
            System.out.println(strings[i]);
            System.out.println(vowelNumber[i]);
        }
    }

    public static void sortByVowelNumber(String[] strings) {
        String tempString;
        int tempInt;
        for (int i = 0; i < number - 1; i++) {
            for (int j = 0; j < number - 1; j++) {
                if (vowelNumber[j] > vowelNumber[j + 1]) {
                    tempString = strings[j];
                    tempInt = vowelNumber[j];
                    strings[j] = strings[j + 1];
                    vowelNumber[j] = vowelNumber[j + 1];
                    strings[j + 1] = tempString;
                    vowelNumber[j + 1] = tempInt;
                }
            }
        }
    }


}
