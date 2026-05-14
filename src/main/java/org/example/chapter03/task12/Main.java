package main.java.org.example.chapter03.task12;

public class Main {

    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }

    public static void main(String[] args) {

        int n = 3;

        Runnable task = () -> System.out.println("Hello " + n);

        repeat(n, task);

        /*
        Runnable bad = () -> {
            n++;
        };
        */
    }
}