package com.jonathankim.monster_factory.controller;

import com.jonathankim.monster_factory.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MonsterController {
    // instantiate MonsterService class for DI
    private MonsterService monsterService;
    @Autowired
    public MonsterController(MonsterService monsterService) {
        this.monsterService = monsterService;
    }


}
