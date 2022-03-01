package com.jonkim.interface_exercise;

public class Main {
    public static void main(String[] args) {
        // example of using concrete classes implementing interface
        Person person = new Person();
        person.walk();

        Animal animal = new Animal();
        animal.walk();

        // Example of using Interface as an argument
        HelloClass hello = new HelloClass();
        hello.helloLivingAnimal(new Person()); // You can use any class that implements the interface this way when using
        hello.helloLivingAnimal(new Animal()); // the interface as an argument just by passing it through here as a new object

        // Example of concrete method not being poly morphic
        hello.method2(new Person()); // this works and outputs because the method has the Person argument

//        hello.method2(new Animal()); this creates a compile error because the method wants only Person type
    }
}
