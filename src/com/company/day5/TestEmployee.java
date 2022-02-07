package com.company.day5;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(0, "James", "Sales and marketing", 23, "male");
        Employee employee2 = new Employee(1, "Cloe", "Sales and marketing", 32, "female");
        Employee employee3 = new Employee(3, "Arthur", "IT department", 26, "male");
        Employee employee4 = new Employee(3, "Margot", "Sales and marketing", 31, "female");
        Employee employee5 = new Employee(4, "Dan", "Sales and marketing", 36, "male");

        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
        employee4.printInfo();
        employee5.printInfo();

    }
}
