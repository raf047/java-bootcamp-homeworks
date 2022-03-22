package com.company.day23;

public interface List<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    E get(int index);
    void  add(E val);
    void add(E val, int index);
    void delete(int index);
}
