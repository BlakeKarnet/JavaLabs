package main.java.org.example.chapter03.task09;

public class Main {
    public static void main(String[] args) {
        Greeter gr1 = new Greeter(3, "Epson");
        Greeter gr2 = new Greeter(12, "Kirill");

        Thread t1 = new Thread(gr1);
        Thread t2 = new Thread(gr2);

        t1.start();
        t2.start();
    }
}