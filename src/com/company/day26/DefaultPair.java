package com.company.day26;

public class DefaultPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;
    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }
}
