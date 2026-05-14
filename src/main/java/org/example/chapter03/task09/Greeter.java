package main.java.org.example.chapter03.task09;

public class Greeter implements java.lang.Runnable {
    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello, " + target);
        }
    }
}