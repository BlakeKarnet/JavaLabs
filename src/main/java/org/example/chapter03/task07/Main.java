package main.java.org.example.chapter03.task07;

public class Main {
    public static void main(String[] args) {
        DigitSequence sequence = new DigitSequence(1729);

        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}