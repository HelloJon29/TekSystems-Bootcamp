package com.example.readExercise;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Reader myFile = new Reader(); //instantiate Reader object
        myFile.convertFileToString(); // use this method to convert the text to String
        String[] words = myFile.splitFile(); // This splits each word into an array

        HashMap<String, Integer> myMap = new HashMap<>(); // instantiate new HashMap
        TreeMap<String, Integer> myMap2 = new TreeMap<>(); // instantiate new TreeMap

        for(String word : words) { // enhanced loop to add elements to the HashMap using words array
            int count;

            if(myMap2.containsKey(word)) { // if the map contains a word it will add 1 to the value of the key
                count = myMap2.get(word) + 1;
                myMap2.replace(word, count);
            }
            else {
                myMap2.put(word, 1); // if it doesn't already have the word it will just place to word in the map with a value of 1
            }
        }

        System.out.println(myMap); // print HashMap
        System.out.println(myMap2); // print TreeMap
    }
}
