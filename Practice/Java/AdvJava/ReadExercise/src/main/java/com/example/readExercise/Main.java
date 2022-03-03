package com.example.readExercise;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Reader myFile = new Reader(); //instantiate Reader object
        myFile.convertFileToString(); // use this method to convert the text to String
        String[] words = myFile.splitFile(); // This splits each word into an array

        HashMap<String, Integer> myMap = new HashMap<>(); // instantiate new HashMap

        for(String word : words) { // enhanced loop to add elements to the HashMap
            int count;

            if(myMap.containsKey(word)) { // if the map contains a word it will add 1 to the value of the key
                count = myMap.get(word) + 1;
                myMap.put(word, count);
            }
            else {
                myMap.put(word, 1); // if it doesn't already have the word it will just place to word in the map with a value of 1
            }

        }
        System.out.println(myMap);
    }
}
