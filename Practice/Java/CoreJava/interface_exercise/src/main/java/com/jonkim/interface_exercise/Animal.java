package com.jonkim.interface_exercise;

public class Animal implements LivingAnimalInterface {
    @Override
    public void walk() {
        System.out.println("Animal walks");
    }
}
