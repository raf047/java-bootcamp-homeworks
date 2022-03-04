package com.company.day20;

public abstract class Animal {
    protected int weight;

    protected abstract void voice();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
