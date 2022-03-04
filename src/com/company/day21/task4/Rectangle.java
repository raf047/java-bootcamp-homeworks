package com.company.day21.task4;

public class Rectangle implements Shape {
    private int shape1;
    private int shape2;

    public Rectangle(int shape1, int shape2) {
        this.shape1 = shape1;
        this.shape2 = shape2;
    }

    @Override
    public double area() {
        return this.shape1 * this.shape2;
    }

    @Override
    public double perimeter() {
        return 2 * (this.shape1 + this.shape2);
    }

    public int getShape1() {
        return shape1;
    }

    public void setShape1(int shape1) {
        this.shape1 = shape1;
    }

    public int getShape2() {
        return shape2;
    }

    public void setShape2(int shape2) {
        this.shape2 = shape2;
    }
}
