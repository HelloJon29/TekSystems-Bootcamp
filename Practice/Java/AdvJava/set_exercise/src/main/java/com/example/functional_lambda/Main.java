package com.example.functional_lambda;

public class Main {
    public static void main(String[] args) {
        Calculator multiply = (x, y) -> x*y; // Call the Functional Interface type, then name variable, then use lambda exp this is simplified
//        Calculator multiply2 = (int x, int y) -> {return x*y;}; // this is the same as above unsimplifed
        Calculator add = (x, y) -> x+y; // the lambda captures a behaviour for the Interface

        int multipliedResult = multiply.calculate(1,3);
        int addResult = add.calculate(2,3);

        System.out.println(multipliedResult);
        System.out.println(addResult);

        myMethod((x,y)->x+y, (x, y)->x*y);
    }

    public static void myMethod(Calculator m, Calculator d) {
        int int1 = m.calculate(4,5);
        int int2 = d.calculate(3,4);

        System.out.println(int1 + " " + int2);
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}