package com.btcag.bootcamp2024.Model;

public class Robot {
    public String id;
    public String name;
    public int health;
    public int attackRange;
    public int attackDamage;
    public  int movementRate;

    public Robot() {

    }

    public Robot(String id, String name, int health, int attackRange, int attackDamage, int movementRate) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.attackRange = attackRange;
        this.attackDamage = attackDamage;
        this.movementRate = movementRate;
    }
}
