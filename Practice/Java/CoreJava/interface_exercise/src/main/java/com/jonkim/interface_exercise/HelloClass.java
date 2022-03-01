package com.jonkim.interface_exercise;

public class HelloClass {
    public void helloLivingAnimal(LivingAnimalInterface livingAnimalInterface) {
        livingAnimalInterface.walk();
    }

    public void method2(Person person) { // this is to show a compile error on main class
        person.walk();
    }
}
