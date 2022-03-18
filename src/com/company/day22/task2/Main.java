package com.company.day22.task2;

import com.company.day22.task2.exceptions.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        DefaultStack stack = new DefaultStack();
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
//        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());



//        System.out.println(stack.pop());
    }
}
