package com.example.collection_exercises;

import java.util.*;

public class SortingEx {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("hello","two","world","four");
        Comparator<String> myComp = (o1,o2) -> {o1.charAt(1), o2.charAt(1) return (o1.equals(o2)) ? 1: -1;}; // Write the bottom as a lambda expression
//        Comparator<String> comparator = new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                char first = o1.charAt(1);
//                char second = o2.charAt(1);
//                return (first > second) ? 1: -1;
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
//        };

        Comparator comp = comparator;
        Collections.sort(myList,comp);
        System.out.println(myList);

    }
}

