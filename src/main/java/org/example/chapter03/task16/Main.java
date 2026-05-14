package main.java.org.example.chapter03.task16;

public class Main {
    public static void main(String[] args) {
        IntSequence s = IntSequence.randomInts(1, 5);

        for (int i = 0; i < 5; i++) {
            System.out.println(s.next());
        }
    }
}