package com.company.day17;

public class Homework0224 {

    public static void main(String[] args) {
        System.out.println(howMany(true, new boolean[2]));
    }

    public static int howMany(boolean b, boolean... b2) {
        return b2.length;
    }


    public static void add(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void add(int num1, float num2){
        System.out.println(num1 + num2);
    }

    public static void add(float num1, int num2){
        System.out.println(num1 + num2);
    }

    public static float printItemsFloat(int num1, int num2){
        return (float)num1*num2;
    }

    public static int printItemsInt(int num1, int num2){
        return num1*num2;
    }

}
