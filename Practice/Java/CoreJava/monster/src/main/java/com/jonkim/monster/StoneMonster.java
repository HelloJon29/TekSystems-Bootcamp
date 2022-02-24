package com.jonkim.monster;

public class StoneMonster extends Monster{
    private String attackType = "Stone Attack";

    @Override
    protected String attack() {
        String x = this.attackType;
        return x;
    }
}
