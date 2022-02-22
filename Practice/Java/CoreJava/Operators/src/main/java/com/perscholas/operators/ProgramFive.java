package com.perscholas.operators;
//Write a program that uses bitwise operators & and | AND and OR
public class ProgramFive {
    public static void main(String[] args) {
        int x = 7; // 00111
        int y = 17; // 10001
        int z = x & y;
        // To print string binary value
        String z1 = Integer.toBinaryString(z);
        // this will check if both values are 1 bitwise, if true then 1, if false then 0, so from above it will only take 1, which is 1 in decimal
        System.out.println(z);
        System.out.println(z1);
        // Now use | OR bitwise operator
        // This checks if either value has 1, if true then print 1, otherwise 0. If both 0 then print 0
        // this statement should print 10111 which is 23
        int a = x | y;
        // to print binary notation
        String a2 = Integer.toBinaryString(a);
        System.out.println(a);
        System.out.println(a2);
    }
}
