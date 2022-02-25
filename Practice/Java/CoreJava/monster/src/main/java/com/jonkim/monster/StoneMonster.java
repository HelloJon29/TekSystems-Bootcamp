package com.jonkim.monster;

public class StoneMonster extends Monster{
    private String attackType = "Stone Attack";

    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return this.attackType;
    }
}
