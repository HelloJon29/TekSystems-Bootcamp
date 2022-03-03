package com.example.set_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
// Example of set
public class Main {
    public static void main(String[] args) {

    }

    void hashSetMethod() {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(2, 5, 40, 23));
        HashSet<Integer> hashSet = new HashSet<>(integers);

        System.out.println(hashSet);
    }
}
