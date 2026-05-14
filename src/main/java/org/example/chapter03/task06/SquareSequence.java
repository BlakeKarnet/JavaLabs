package main.java.org.example.chapter03.task06;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {
    private BigInteger current = BigInteger.ONE;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        BigInteger result = current.multiply(current);
        current = current.add(BigInteger.ONE);
        return result;
    }
}