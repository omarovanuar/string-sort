package com.epam.module3;

public class Phrase {
    private static final char[] vowel = {'a', 'e', 'y', 'u', 'i'};
    private String value;
    private int vowelNumber;

    public Phrase(String value) {
        this.value = value;
        vowelNumber = countVowelNumber();
    }

    private int countVowelNumber() {
        char[] chars = value.toLowerCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (vowel[j] == chars[i]) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    public Integer getVowelNumber() {
        return vowelNumber;
    }

    @Override
    public String toString() {
        return  "{" + value + "} vowels = " + vowelNumber;
    }
}
