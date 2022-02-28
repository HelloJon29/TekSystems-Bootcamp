package com.jonkim.library;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers kid1 = new KidUsers();
        KidUsers kid2 = new KidUsers();
        //Test Case# 1
        kid1.setAge(10);
        kid2.setAge(18);
        kid1.setBookType("Kids");
        kid2.setBookType("Fiction");
        // Invoke reigster account and request book methods
        kid1.registerAccount();
        kid1.requestBook();
        kid2.registerAccount();
        kid2.requestBook();

        //Test Case# 2
        // Instantiate AdultUsers objects
        AdultUsers adult1 = new AdultUsers();
        AdultUsers adult2 = new AdultUsers();

        // use setter methods
        adult1.setAge(5);
        adult1.setBookType("Kids");
        adult2.setAge(23);
        adult2.setBookType("Fiction");

        // Invoke register account and request book methods
        adult1.registerAccount();
        adult1.requestBook();
        adult2.registerAccount();
        adult2.requestBook();

    }
}
