package com.jonkim.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericsMain {
    public static void main(String[] args) {

        //Example code of no use of Generics
        MyLongClass myLong = new MyLongClass();
        myLong.getaLong();

        MyIntegerClass myInteger = new MyIntegerClass();
        myInteger.getaInt();

        // example code that uses Generics
        MyGenericClass <Integer> myInt = new MyGenericClass<>(); // Instantiate Object while specifying the Type on the left
        myInt.setMyType(5); // Passing in Integer value with Setter
        System.out.println(myInt.getMyType()); // Print to console with Getter

        MyGenericClass <Boolean> myBoolean = new MyGenericClass<>();
        myBoolean.getMyType();

        //example of Generics with ArrayList
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(26);
//      myArray.add("Hello"); --- this is detected at compilier because of the use of generics it will show the error


    }
}
