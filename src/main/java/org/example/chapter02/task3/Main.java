package main.java.org.example.chapter02.task3;

public class Main {
    static class Counter {
        private int value;

        public int increment() {
            value++;
            return value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Counter c = new Counter();

        System.out.println(c.increment());
        System.out.println(c.getValue());
    }
}