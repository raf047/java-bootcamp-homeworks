package com.company.day20.task1;

public class Square extends Shape {
    @Override
    protected void getArea(double r) {
        System.out.println(r * r);
    }

    @Override
    protected void getPerimeter(double r) {
        System.out.println(4 * r);
    }

}
