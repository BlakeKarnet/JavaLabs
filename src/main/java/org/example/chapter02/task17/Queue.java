package main.java.org.example.chapter02.task17;

import java.util.NoSuchElementException;

public class Queue {
    private static class Node {
        private String value;
        private Node next;

        Node(String value) {
            this.value = value;
            this.next = null;
        }
    }

    public class Iterator {
        private Node curr;

        Iterator() {
            this.curr = head;
        }

        public boolean hasNext() {
            return curr != null;
        }

        public String next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException("Next element is null");
            } else {
                String returned = this.curr.value;
                this.curr = this.curr.next;
                return returned;
            }
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void add(String inputValue) {
        Node newNode = new Node(inputValue);
        if (this.size == 0) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.size++;
    }

    public void remove() {
        if (this.size == 0) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            --this.size;
            this.head = this.head.next;
            if (this.size == 0) {
                this.tail = null;
            }
        }
    }

    public Iterator iterator() {
        return new Iterator();
    }
}