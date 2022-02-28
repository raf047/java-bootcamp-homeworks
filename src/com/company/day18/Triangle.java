package com.company.day18;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(){

    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isTriangleValid(){
        return ((this.sideA + this.sideB) > this.sideC) && ((this.sideA + this.sideC) > this.sideB) && ((this.sideB + this.sideC) > this.sideA);
    }

    public boolean check(Triangle triangle){
        return triangle.isTriangleValid();
    }

    public boolean isRight(){
        int max = sideA;
        int side1 = sideB;
        int side2 = sideC;
        if (max < sideB){
            max = sideB;
            side1 = sideA;
        }
        if (max < sideC){
            max = sideC;
            side1 = sideA;
            side2 = sideB;
        }
        return side1*side1 + side2*side2 == max * max;
    }

    public int countPerimeter(){
        return this.sideA + this.sideB + this.sideC;
    }

    public double countSquare(){
        double p = countPerimeter() / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
}
