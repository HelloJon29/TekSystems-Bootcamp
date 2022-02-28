package com.jonkim.exception;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

    }

    private static void method1(){
        try {
            method2();
        } catch (FileNotFoundException fileNotFoundException) {
            throw new RuntimeException();
        }
    }

    private static void method2() throws FileNotFoundException {
        method3();
    }

    private static void method3() throws FileNotFoundException {

        File file = new File("Desktop/test/xyz.txt");
    }
}
