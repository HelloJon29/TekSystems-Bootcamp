package com.perscholas.operators;
// Write a program that uses Integer.toBinaryString() and right shift operator >>
public class ProgramFour {
    public static void main(String[] args) {
        //declare variables, pass in 150,225,1555,32456 to x to see results
        int x = 150;
        //Use toBinaryString and pass in x
        String x2 = Integer.toBinaryString(x);
        // print result
        System.out.println("Initial values Binary: " + x2);
        // reassign x and use >> operator by 2
        x = x >> 2;
        // the result should be that 2 bits are removed from the right
        //print both decimal and binary notations
        System.out.println("Decimal value after right shift: " + x);
        String x3 = Integer.toBinaryString(x);
        System.out.println("Binary notation after right shift: " + x3);
    }
}
