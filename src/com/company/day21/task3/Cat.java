package com.company.day21.task3;

public class Cat extends Animal {

     public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void sound() {
        System.out.println("Myau");
    }
}
