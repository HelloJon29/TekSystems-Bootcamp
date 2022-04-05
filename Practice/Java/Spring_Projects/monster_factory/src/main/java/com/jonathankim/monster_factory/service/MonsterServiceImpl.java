package com.jonathankim.monster_factory.service;

import com.jonathankim.monster_factory.model.Monster;
import com.jonathankim.monster_factory.repository.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MonsterServiceImpl implements MonsterService {
    // instantiate MonsterRepository for DI
    private MonsterRepository monsterRepository;
    @Autowired
    public MonsterServiceImpl(MonsterRepository monsterRepository) {
        this.monsterRepository = monsterRepository;
    }

    @Override
    public List<Monster> getAllMonsters() {
        return monsterRepository.findAll();
    }
    @Override
    public void saveMonster(Monster monster) {
        monsterRepository.save(monster);
    }

    @Override
    public Monster getMonsterById(long monsterId) {
        Monster monster = monsterRepository.getById(monsterId);
        if(monster == null) {
            throw new MonsterNotFoundException();
        }
        return monster;
    }

    @Override
    public void deleteMonsterById(long monsterId) {
        monsterRepository.deleteById(monsterId);
    }
}
