package com.company.day21.immutable;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(224, 134000, 470);
        Car car = new Car(2003, "W211", "MB", engine);
        System.out.println(engine.toString());
        System.out.println(car.toString());

        engine.setHorsePow(447);
        System.out.println(engine.toString());
        System.out.println(car.toString());

        car.getEngine().setHorsePow(4747);
        System.out.println(car.toString());


    }
}
