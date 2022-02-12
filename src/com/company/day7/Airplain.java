package com.company.day7;

public class Airplain {
    static int start = 2;
    final int end;
    public Airplain(int x) {
        x = 4;
        end = x;
    }
    public void fly(int distance) {
        System.out.print(end-start+" ");
        System.out.print(distance);
    }
    public static void main(String... start) {
        new Airplain(10).fly(5);
    }
}
