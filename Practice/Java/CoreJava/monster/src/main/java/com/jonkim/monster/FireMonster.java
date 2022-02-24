package com.jonkim.monster;

public class FireMonster extends Monster{
    private String attackType = "Fire Attack";

    @Override
    protected String attack() {
        String x = this.attackType;
        return x;
    }
}
