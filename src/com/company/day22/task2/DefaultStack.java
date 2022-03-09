package com.company.day22.task2;

import com.company.day22.task2.exceptions.EmptyStackException;
import com.company.day22.task2.exceptions.StackIndexOutOfBoundsException;

public class DefaultStack implements Stack {
    private int[] nums;
    private int index = 0;
    private static final int MAX_SIZE = 5;

    public DefaultStack() {
        this.nums = new int[MAX_SIZE];
    }

    @Override
    public void push(int val) {
        if (index == MAX_SIZE){
            throw new StackIndexOutOfBoundsException("Out of bound");
        }
        this.nums[index] = val;
        index++;
    }

    @Override
    public int pop() {
        if (index == 0){
            throw new EmptyStackException("No items");
        }
        int item = this.nums[index - 1];
        this.nums[index - 1] = 0;
        index--;
        return item;
    }



}
