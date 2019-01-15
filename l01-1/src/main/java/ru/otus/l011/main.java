package ru.otus.l011;

import com.google.common.collect.HashMultiset;

import java.util.*;

public class main {
    private static final String INPUT_TEXT = "Hello World! Hello All! Hi World!";

    public static void main(String[] args) {
        HashMultiset<String> multiset = HashMultiset.create(Arrays.asList(INPUT_TEXT.split(" ")));
        System.out.println("Слов в строке: " + multiset.size());
    }
}
