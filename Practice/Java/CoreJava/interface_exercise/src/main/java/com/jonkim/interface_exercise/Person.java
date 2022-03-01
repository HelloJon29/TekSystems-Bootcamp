package com.jonkim.interface_exercise;

public class Person implements LivingAnimalInterface {
    @Override
    public void walk() {
        System.out.println("Person walks");
    }
}
