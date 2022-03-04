package com.company.day21.immutable;

public class Engine {
    private int horsePow;
    private int mileage;
    private int weight;

    public Engine(){

    }

    public Engine(int horsePow, int mileage, int weight) {
        this.horsePow = horsePow;
        this.mileage = mileage;
        this.weight = weight;
    }

    public Engine(Engine engine) {
        this.horsePow = engine.getHorsePow();
        this.mileage = engine.getMileage();
        this.weight = engine.getWeight();
    }

    public int getHorsePow() {
        return horsePow;
    }

    public void setHorsePow(int horsePow) {
        this.horsePow = horsePow;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePow=" + horsePow +
                ", mileage=" + mileage +
                ", weight=" + weight +
                '}';
    }
}
