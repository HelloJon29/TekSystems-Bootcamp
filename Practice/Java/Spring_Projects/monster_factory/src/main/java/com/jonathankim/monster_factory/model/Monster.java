package com.jonathankim.monster_factory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Monsters")
public class Monster {
    @Id
    @Column(name = "monster_id")
    private long monsterId;

    @Column(name = "monster_name")
    private String name;

    @Column(name = "monster_size")
    private String size;

    @Column(name = "monster_color")
    private String color;

    @Column(name = "monster_loc")
    private String location;

    // Getters Setters
    public long getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(long monsterId) {
        this.monsterId = monsterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
