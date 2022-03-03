package com.example.functional_lambda;

public class LambdaRunnable {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is from annon code");
            }
        };
        runnable.run();

        Runnable runnable2 = () -> System.out.println("This is from Lambda");
        runnable2.run();
    }
}

