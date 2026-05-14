package main.java.org.example.chapter03.task07;

import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> {
    private int number;
    private int divisor;

    public DigitSequence(int number) {
        this.number = number;
        this.divisor = 1;

        while (number / divisor >= 10) {
            divisor *= 10;
        }
    }

    @Override
    public boolean hasNext() {
        return divisor > 0;
    }

    @Override
    public Integer next() {
        int digit = number / divisor;
        number %= divisor;
        divisor /= 10;
        return digit;
    }

    @Override
    public void remove() {
    }
}