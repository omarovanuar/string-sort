package com.epam.module3;

public class StringArray {
    private static final char[] vowel = {'a', 'e', 'y', 'u', 'i', 'o', 'A', 'E', 'Y', 'U', 'I', 'O'};
    private int number;
    private String[] strings;
    private int vowelNumber[];

    public StringArray(int number) {
        this.number = number;
        strings = new String[number];
        vowelNumber = new int[number];
    }

    public void countVowelNumber() {
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

    public void sortByVowelNumber() {
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

    public void showArrays() {
        for (int i = 0; i < number; i++) {
            System.out.println(strings[i]);
            System.out.println(vowelNumber[i]);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setString(int number, String string) {
        strings[number] = string;
    }

}
