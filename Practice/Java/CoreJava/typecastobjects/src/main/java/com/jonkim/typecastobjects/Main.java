package com.jonkim.typecastobjects;

public class Main {

    public static void main(String[] args) {
        // these work fine, assining sub type to super
        Student student1 = new Student();
        Student student2 = new EnglishMajor();
        Student student3 = new MathMajor();

        // This is a compiler error, can't instantiate a sub class and cast to super class
        // MathMajor mathMajor1 = new Student();

        //this is fine by compiler but is a type mismatch error/ runtime error
        MathMajor mathMajor1 = (MathMajor) student1;

        // No compile error and no runtime error, not advised to use
        MathMajor mathMajor3 = (MathMajor) student3; //what this is doing is changing the Type, from Student to MathMajor where the object was already a MathMajor


    }
}
