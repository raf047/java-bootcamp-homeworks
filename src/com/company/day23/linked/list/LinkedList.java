package com.company.day23.linked.list;

import com.company.day23.List;

import java.util.Iterator;

public class LinkedList<E> implements List<E> {

    private int size;
    private Node<E> head;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size){
            throw new  IllegalArgumentException();
        }
        Node<E> node = this.getNode(index);
        return node.getItem();
    }

    @Override
    public void add(E val) {
        Node<E> node = new Node(val);
        if (this.size == 0) {
            this.head = node;
        } else {
            Node<E> curr = this.head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(node);

        }
        this.size++;

    }

    @Override
    public void add(E val, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = new Node(val);
        if (index == 0) {
            node.setNext(this.head);
            this.head = node;
        }
        else {
            Node<E> curr = this.head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            node.setNext(curr.getNext());
            curr.setNext(node);
        }
        this.size++;

    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index < 0 && index >= size) {
            throw new IndexOutOfBoundsException();
        } if (index == 0){
            this.head = this.head.getNext();
        }else {
            Node<E> curr = this.head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            curr.setNext(curr.getNext().getNext());
        }
        this.size--;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        Node<E> curr = head;

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public E next() {
            E val = curr.getItem();
            curr = curr.next;
            return val;
        }
    }

    public Node<E> getNode(int index) throws IndexOutOfBoundsException {
        Node<E> curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node() {
        }

        public Node(E item) {
            this.item = item;
        }

        public Node(Node<E> node) {
            this.item = node.getItem();
            this.next = node.getNext();
        }

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        res.append("[");
        for (E e : this) {
            res.append(e).append("->");
        }
        res.append("null").append("]");

        return res.toString();
    }
}
