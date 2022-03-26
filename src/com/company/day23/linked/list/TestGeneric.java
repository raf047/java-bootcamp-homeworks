package com.company.day23.linked.list;

public class TestGeneric<T> {

    T age;
   static String name = "47";

    public static void main(String[] args) {
        String name = "2626";
        System.out.println(name);
    }

    public <T> void printAge(T t){
        System.out.println(t);
    }
}
