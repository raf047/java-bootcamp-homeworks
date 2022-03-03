package com.company.day20.task1;

public class Circle extends Shape {
    private double pi = Math.PI;
    @Override
    protected void getArea(double r) {
        System.out.println(this.pi * r *r);
    }

    @Override
    protected void getPerimeter(double r) {
        System.out.println(2 * this.pi * r);
    }
}
