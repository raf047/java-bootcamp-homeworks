package com.company.day5;

public class Employee {

    //    id, name, department, age, gender
    int id;
    String name;
    String department;
    int age;
    String gender;

    public Employee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    /**
     * print Employee information
     */
    public void printInfo() {
        System.out.println("#" + id + ", Name: " + this.name + ", Department: "+ this.department + ", Age: " + this.age + ", Gender: " + this.gender);
    }
}
