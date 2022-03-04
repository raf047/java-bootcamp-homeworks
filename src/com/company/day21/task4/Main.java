package com.company.day21.task4;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(4, 7);
        Shape[] shapes = new Shape[]{square, circle, rectangle};

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area() + " , Perimeter: " + shape.perimeter());
        }
    }
}
