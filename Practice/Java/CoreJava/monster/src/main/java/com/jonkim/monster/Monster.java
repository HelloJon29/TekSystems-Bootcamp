package com.jonkim.monster;

public class Monster {
    private String name;

    public Monster(){}

    public String getName() {
        return this.name;
    }

    public Monster(String name) {
        this.name = name;
    }
    public String attack() {
        return "I don't know how to attack";
    }
}
