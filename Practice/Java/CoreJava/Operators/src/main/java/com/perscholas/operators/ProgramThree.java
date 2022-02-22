package com.perscholas.operators;
//Write a program that uses Integer.toBinaryString() and left shift operator <<
public class ProgramThree {
    public static void main(String[] args) {
        //declare variables, pass in 2,9,17,88 to x to see results
        int x = 88;
        //Use toBinaryString and pass in x
        String x2 = Integer.toBinaryString(x);
        // print result
        System.out.println("Initial values Binary: " + x2);
        // reassign x and use << operator by 1
        x = x << 1;
        // the result should be that an extra 0 is added on the right, making 2 to 4 or 0100
        //print both decimal and binary notations
        System.out.println("Decimal value after left shift: " + x);
        String x3 = Integer.toBinaryString(x);
        System.out.println("Binary notation after left shift: " + x3);

    }
}
