package com.epam.module3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utils {
    private static final Comparator<Phrase> VOWEL_NUMBER_COMPARATOR = (o1, o2) -> o1.getVowelNumber().compareTo(o2.getVowelNumber());

    public static List<Phrase> sort(List<Phrase> list) {
        Collections.sort(list, VOWEL_NUMBER_COMPARATOR);
        return list;
    }
}
