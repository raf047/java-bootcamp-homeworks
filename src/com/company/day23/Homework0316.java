package com.company.day23;

import java.util.Iterator;

public class Homework0316 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(47);
        list.add(74);
        list.add(4747);
        list.add(474747);
        list.add(47474747);
        list.add(470 );
        list.add(4700);

        list.add(407,0);
        list.add(4007,3);
        list.add(4007,9);
        System.out.println(list.toString());

//        list.delete(0);
//        System.out.println(list.toString());

//        list.delete(0);
//        System.out.println(list.toString());

//        list.delete(3);
//        System.out.println(list.toString());

//        list.delete(6);

//        System.out.println(list.get(0));
        System.out.println(list.get(3));
//        System.out.println(list.get(9));

//        ArrayList
//        List<String> str = new java.util.LinkedList<>()

//        for (Integer integer : (Iterable<Integer>) list) {
//            System.out.println(integer);
//        }

//        System.out.println(list.toString());
    }
}
