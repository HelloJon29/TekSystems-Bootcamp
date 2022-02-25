package com.jonkim.monster;

public class FireMonster extends Monster{
    private String attackType = "Fire Attack";

    public FireMonster(String name) {
        super(name);

    }
    @Override
    public String attack() {
        return this.attackType;
    }
}
