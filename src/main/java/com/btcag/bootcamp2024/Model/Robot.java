package com.btcag.bootcamp2024.Model;

public class Robot {
    String id;
    String name;
    int health;
    int attackRange;
    int attackDamage;
    int movementRate;

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

    //Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getMovementRate() {
        return movementRate;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setMovementRate(int movementRate) {
        this.movementRate = movementRate;
    }
}
