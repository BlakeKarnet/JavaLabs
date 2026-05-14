package main.java.org.example.chapter01.task6;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("factorial must be positive ");

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 1000;
        BigInteger fact = factorial(n);
        System.out.println(n + "! = " + fact);
    }
}