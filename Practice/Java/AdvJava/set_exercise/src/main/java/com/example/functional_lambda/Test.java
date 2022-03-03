package com.example.functional_lambda;

import java.util.function.IntPredicate;

public class Test {
    public static void main(String[] args) {

        IntPredicate predicate = x -> x <20; // this is provided by JDK takes int value and outputs boolean
        boolean test = predicate.test(25);
        System.out.println(test);
    }

    public static void myMethod() {
        Calc add = ((x, y) -> x+y);
    }
}

@FunctionalInterface
interface Calc {
    int calculate(int x, int y);
}
