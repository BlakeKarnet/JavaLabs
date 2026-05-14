package main.java.org.example.chapter03.task16;

import java.util.Random;

public interface IntSequence {

    boolean hasNext();
    int next();

    static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }

    class RandomSequence implements IntSequence {
        private int low;
        private int high;
        private Random rnd = new Random();

        public RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public boolean hasNext() {
            return true;
        }

        public int next() {
            return low + rnd.nextInt(high - low + 1);
        }
    }
}