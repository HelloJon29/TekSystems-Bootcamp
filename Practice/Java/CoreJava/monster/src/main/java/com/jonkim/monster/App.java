package com.jonkim.monster;

public class App {
    public static void main(String[] args) {
        Monster m1 = new FireMonster("u2r2"); // Instantiated new Monster Object of Monster class
        Monster m2 = new WaterMonster("u2r2");
        Monster m3 = new StoneMonster("r2u2");

        System.out.println(m1.attack()); // print their attacks to console
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("ru2u"); // m1 died so a new monster took its place
        System.out.println(m1.attack());

        Monster m4 = new Monster("r2r2"); // This monster doesn't have a type and cant attack

        System.out.println(m4.attack());
    }
}
