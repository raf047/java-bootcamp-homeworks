package com.company.day21.task4;

public class Square implements Shape {
    private int shape;

    public Square(int shape) {
        this.shape = shape;
    }

    @Override
    public double area() {
        return Math.pow(this.shape,2);
    }

    @Override
    public double perimeter() {
        return 4 * this.shape;
    }

    public int getShape() {
        return shape;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }
}
