package com.epam.module3;

public class Runner {
    public static void main(String[] args) {
        StringArray stringArray = new StringArrayFactory().getStringArray();
        stringArray.countVowelNumber();

        System.out.println("\nArray with number of vowels:");
        stringArray.showArrays();

        System.out.println("\nSorted array by number of vowels:");
        stringArray.sortByVowelNumber();
        stringArray.showArrays();
    }
}
