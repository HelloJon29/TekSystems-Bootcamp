package com.jonkim.monster;

public class WaterMonster extends Monster{
    private String attackType = "Water Attack";

    @Override
    protected String attack() {
        String x = this.attackType;
        return x;
    }
}
