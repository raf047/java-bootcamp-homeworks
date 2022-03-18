package com.company.day23;

public interface List {
    int size();
    boolean isEmpty();
    int get(int index);
    void add(int val);
    void add(int val, int index);
    void delete(int index);
}
