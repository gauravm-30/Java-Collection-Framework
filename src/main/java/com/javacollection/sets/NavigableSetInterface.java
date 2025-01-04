package com.javacollection.sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterface {
    public static void main(String[] args) {
        NavigableSet<Integer> integerNavigableSet = new TreeSet<>();
        integerNavigableSet.add(1);
        integerNavigableSet.add(2);
        integerNavigableSet.add(3);
        integerNavigableSet.add(4);
        integerNavigableSet.add(5);

        System.out.println(integerNavigableSet.floor(5));

    }
}
