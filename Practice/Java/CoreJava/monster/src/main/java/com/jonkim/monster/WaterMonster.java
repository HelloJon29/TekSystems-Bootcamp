package com.jonkim.monster;

public class WaterMonster extends Monster{
    private String attackType = "Water Attack";

    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return (getName()) + " " + this.attackType;
    }
}
