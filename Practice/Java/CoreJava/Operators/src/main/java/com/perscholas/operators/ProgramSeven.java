package com.perscholas.operators;
// Write a program that shows 3 ways to increment by 1
public class ProgramSeven {
    public static void main(String[] args) {
        // 1 way to increment is to just increment the variable multiple times
        int x = 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);

        // Another way is to increment the variable within println
        int y = 4;
        System.out.println(y++ + "\n" + y++ + "\n" + y++);

        // And a 3rd way is to loop it, here I use a for loop, initialize z at 7, and set the condition to increment until z
        // is = 9 inclusive then exit the loop
        for(int z = 7; z <= 9; z++) {
            System.out.println(z);
        }

    }
}
