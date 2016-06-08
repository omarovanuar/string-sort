package com.epam.module3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUtil {
    private static final Comparator<Phrase> VOWEL_NUMBER_COMPARATOR = (o1, o2) -> o1.getVowelNumber().compareTo(o2.getVowelNumber());
    private List<Phrase> list = new ArrayList<>();

    public SortUtil(List<Phrase> list) {
        this.list = list;
    }

    public List<Phrase> sort() {
        Collections.sort(list, VOWEL_NUMBER_COMPARATOR);
        return list;
    }
}
