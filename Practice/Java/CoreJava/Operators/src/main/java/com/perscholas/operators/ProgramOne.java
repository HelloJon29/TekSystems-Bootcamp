package com.perscholas.operators;
// Create a program to output numbers in binary format
public class ProgramOne {
    public static void main(String[] args) {
        // Declare variables for numbers that need to be converted to binary
        int a = 1; // the binary of 1 is 1 where 1/2 is the final remainder
        int b = 8;
        String b2 = Integer.toBinaryString(b); // This function takes a integer and does the conversion and stores it into a String
        int c = 33;
        String c2 = Integer.toBinaryString(c);
        int d = 78;
        String d2 = Integer.toBinaryString(d);
        int e = 787;
        String e2 = Integer.toBinaryString(e);
        int f = 33987;
        String f2 = Integer.toBinaryString(f);

        //Print to console each converted binary values
        System.out.println(a + "\n" + b2 + "\n" + c2 + "\n" + d2 + "\n" + e2 + "\n" + f2);

    }
}
