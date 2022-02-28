package com.jonkim.inner_class;

public class Main {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(); // You have to instantiate the outer class first, it cant exist by itself
        String myString = innerClass.myInnerMethod();
        System.out.println(myString);

        System.out.println();
    }
}
