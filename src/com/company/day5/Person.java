package com.company.day5;

public class Person {

    String name;
    int age;
    String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * print Person information
     */
    public void printInfo() {
        System.out.println(this.name + " : " + this.age + " : " + this.address);
    }
}
