package com.jonathankim.myfirstjava;

public class Person extends PersonAbsract{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){

    }

    public String getInfo() {
        return name + " " + age;
    }
    @Override
    public void height() {

    }

    public void weight() {

    }
}

