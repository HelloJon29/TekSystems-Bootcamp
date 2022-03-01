package com.jonkim.genericsagain;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // example of not using generics
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello1");
        arrayList.add("hello2");
        arrayList.add(23);

        String myString1 = (String) arrayList.get(0);
        System.out.println(myString1);
//        String myString2 = (String) arrayList.get(2); this will cause a runtime error, its not detected by compiler

        // example of using Generics
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("HelloGeneric");
//        arrayList1.add(13); this will now show as a compile error right away saying typeMismatch
        String s2 = arrayList1.get(0); // we do not have to cast type anymore
        System.out.println(s2);

        // Generic Type Contraints
        MyGenericClass<Integer> myClass = new MyGenericClass<>(); // this is ok because Integer is a child of Number
//      MyGenericClass<String> myClass2 = new MyGenericClass<>(); // this is a compiler error because String is not from Number
    }
}

class MyGenericClass <T extends Number> {
    private T myField;
}
