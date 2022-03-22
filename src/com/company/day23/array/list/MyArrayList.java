package com.company.day23.array.list;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList implements List {
    private int capacity = 10;
    private int size;
    private int[] arr = new int[this.capacity];

    public MyArrayList() {
    }

    public MyArrayList(int capacity) throws IllegalArgumentException {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        } else {
            this.capacity = capacity;
            this.arr = new int[capacity];
        }
    }

    public MyArrayList(int[] array) {
        if (array.length > this.capacity){
            this.capacity = array.length;

        }
        this.size = array.length;
        this.arr = array;

    }

    public int[] convertToArray() {
        int[] newArr = new int[this.size];
        System.arraycopy(arr, 0, newArr, 0, this.size);
        return newArr;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int get(int index) throws IllegalArgumentException {
        if (index < 0 || index >= this.size){
            throw new IllegalArgumentException("illegal index");
        }
        return this.arr[index];
    }

    public boolean containItem(int val){
        for (int i = 0; i < size; i++) {
            if (this.arr[i] == val){
                return true;
            }
        }
        return false;
    }

    public int getIndex(int val){
        for (int i = 0; i < size; i++) {
            if (this.arr[i] == val){
                return i;
            }
        }
        throw new IllegalArgumentException("Not found " + val);
    }

    @Override
    public void add(int val) {
        if (capacity > size) {
            this.arr[size] = val;
        } else {
            this.capacity *= 2;
            int[] newArr = new int[this.capacity];
            if (size >= 0) System.arraycopy(arr, 0, newArr, 0, size);
            newArr[size] = val;
            this.arr = newArr;
        }
        size++;
    }

    @Override
    public void add(int val, int index) throws IllegalArgumentException {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("illegal index");
        }
        if (index == size) {
            this.add(val);
            return;
        } else {
            if (capacity == size) {
                this.capacity *= 2;
                int[] newArr = new int[this.capacity];
                for (int i = 0; i < index; i++) {
                    newArr[i] = arr[i];
                }
                newArr[index] = val;
                for (int i = index + 1; i < size + 1; i++) {
                    newArr[i] = arr[i - 1];
                }
                this.arr = newArr;
            } else {
                for (int i = size; i > index; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[index] = val;
            }
        }
        this.size++;
    }

    @Override
    public void delete(int index) throws IllegalArgumentException{
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("illegal index");
        }
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];

        }
        this.size--;
    }

    public void deleteItem(int val) throws IllegalArgumentException{
        if (!containItem(val)){
            throw new IllegalArgumentException("Not found " + val);
        }
        int index = getIndex(val);
        delete(index);
    }

    private class MyArrayListIterator implements Iterator<Integer>{
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {
            int item = arr[index];
            index++;
            return item;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayListIterator();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for (int i = 0; i < this.size; i++) {
            str.append(this.arr[i]).append(", ");
        }
        String s = String.valueOf(str);
        s = s.substring(0, s.length() - 1);
        return s + "]";
    }
}
