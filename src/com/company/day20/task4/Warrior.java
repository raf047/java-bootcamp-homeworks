package com.company.day20.task4;

public abstract class Warrior {
    private String name;
    private String type;
    private String power;
    private String health;

    public Warrior(){}

    public Warrior(String name, String type, String power, String health) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.health = health;
    }

    public abstract void hit();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
}
