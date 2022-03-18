package com.company.day23;

import org.w3c.dom.Node;

import java.util.Iterator;

public class LinkedList implements List , Iterable<Integer> {

    private int size;
    private Node head;

    /**
     * return size of list
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * check is list empty or not
     * @return
     */
    @Override
    public boolean isEmpty() {
        return this.size != 0;
    }

    /**
     * return item of given index
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        Node node = this.getNode(index);
        return node.getItem();
    }

    /**
     * add item from the end
     * @param val
     */
    @Override
    public void add(int val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
        } else {
            Node curr = this.head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(node);

        }
        this.size++;

    }


    /**
     * add item on given index
     * @param val
     * @param index
     * @throws IndexOutOfBoundsException
     */
    @Override
    public void add(int val, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = new Node(val);
        if (index == 0) {
            node.setNext(this.head);
            this.head = node;
        }
        else {
            Node curr = this.head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            node.setNext(curr.getNext());
            curr.setNext(node);
        }
        this.size++;

    }

    /**
     * delete item which have given index
     * @param index
     * @throws IndexOutOfBoundsException
     */
    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index < 0 && index >= size) {
            throw new IndexOutOfBoundsException();
        } if (index == 0){
            this.head = this.head.getNext();
        }else {
            Node curr = this.head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getNext();
            }
            curr.setNext(curr.getNext().getNext());
        }
        this.size--;
    }

    /**
     * iterator
     * @return
     */
    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Integer> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {
            LinkedList.Node node = getNode(index);
            index++;
            return node.getItem();
        }
    }

    /**
     * get Node object from given index
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    public Node getNode(int index) throws IndexOutOfBoundsException {
        Node curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr;
    }




    private static class Node {
        int item;
        Node next;

        public Node() {
        }

        public Node(int item) {
            this.item = item;
        }

        public Node(Node node) {
            this.item = node.getItem();
            this.next = node.getNext();
        }

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }

        public int getItem() {
            return item;
        }

        public void setItem(int item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public String toString() {
        String str = "";
        Node lastNode = this.head;
        while (lastNode.getNext() != null) {
            str += lastNode.getItem() + " , ";
            lastNode = lastNode.getNext();
        }
        return str + lastNode.getItem();
    }
}
