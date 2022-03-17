package com.example.overrideTests;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            
        }
        return super.equals(obj);
    }
}

class Main {

    public static void main(String[] args) {
        Person person1 = new Person("sang",30);
        Person person2 = new Person("sang",30);

        boolean b1 = (person1 == person2) ? true : false;
        boolean b2 = (person1.equals(person2)) ? true : false;

        System.out.println(b1 + " " + b2);

    }
}
