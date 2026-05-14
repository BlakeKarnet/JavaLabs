package main.java.org.example.chapter03.task04;

public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence of(int... values) {
        class ArraySequence implements IntSequence {
            private int index = 0;

            public boolean hasNext() {
                return index < values.length;
            }

            public int next() {
                return values[index++];
            }
        }

        return new ArraySequence();
    }

    static IntSequence constant(int value) {
        return new IntSequence() {
            public boolean hasNext() {
                return true;
            }

            public int next() {
                return value;
            }
        };
    }
}