package com.company.day23.array.list;

public interface List extends Iterable<Integer> {
    int size();
    boolean isEmpty();
    int get(int index);
    void add(int val);
    void add(int val, int index);
    void delete(int index);
}
