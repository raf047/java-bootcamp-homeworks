package com.company.day21.task3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(4, "animal") {
            @Override
            public void sound() {
                System.out.println("Anonymous voice");
            }
        };

        Animal animalCat = new Cat(47, "Murka");
        Cat cat = new Cat(7, "Barsik");

        System.out.println(animal.getAge() + " , " + animal.getName());
        animal.sound();
        System.out.println(animalCat.getAge() + " , " + animalCat.getName());
        animalCat.sound();
        System.out.println(cat.getAge() + " , " + cat.getName());
        cat.sound();

    }
}
