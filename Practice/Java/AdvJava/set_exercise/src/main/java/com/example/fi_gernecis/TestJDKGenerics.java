package com.example.fi_gernecis;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestJDKGenerics {
    public static void main(String[] args) {
        // example of using Supplier<T> with a String
        Supplier<String> supplier = () -> "Hello";
        String suppliedString = supplier.get(); // using the .get() to call the value of supplier and store in variable
        System.out.println(suppliedString);

        Supplier<Integer> supplier2 = () -> 34;
        Integer suppliedInteger = supplier2.get();
        System.out.println(suppliedInteger);

        // Example of Consumer, just takes input and does something with it, no return value
        Consumer<Integer> myConsumer = x -> System.out.println(x);
        myConsumer.accept(340);

        //Example of Function
        Function<Integer, String> function
                = x -> x.toString();
        String result = function.apply(67);
        System.out.println(result);

        // Example of Predicate and its boolean result from .test()
        Predicate<Integer> predicate = x -> x > 10;
        boolean isTrue = predicate.test(3);
        System.out.println(isTrue);
    }
}
