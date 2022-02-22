package com.perscholas.operators;
//Write a program that shows the differences between postfix and prefix increments
public class ProgramEight {
    public static void main(String[] args) {
        // Initialize variables along with sum variable
        int x = 5;
        int y = 8;
        // This will use the prefix operator first which will increment then add showing 14
        //int sum = ++x + y;

        //This will use postfix operator which will add the values first then incremnt, showing 13
        int sum = x++ + y;
        //Print results
        System.out.println(sum);

    }
}
