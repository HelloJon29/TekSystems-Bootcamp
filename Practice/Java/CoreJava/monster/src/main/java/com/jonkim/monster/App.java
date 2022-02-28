package com.jonkim.monster;

public class App {
    public static void main(String[] args) {
        //Create array of monsters
        Monster[] monsters = {new StoneMonster("a1b1"),
                new FireMonster("a1b2"),
                new StoneMonster("a1b3"),
                new WaterMonster("a2b1")
        };

        // Test new array
        MonsterHandler monsterHandler = new MonsterHandler();
        monsterHandler.handleMonsters(monsters);

    }
}
