package main.java.org.example.chapter01.task5;

public class MaxInt {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE + 1;
        double newMax = (double) maxInt;

        System.out.println("maxInt: " + maxInt + "\n");
        System.out.println("maxInt casted to double: " + newMax);
    }
}