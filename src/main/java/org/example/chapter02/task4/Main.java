package main.java.org.example.chapter02.task4;

public class Main {
    static class IntHolder {
        int value;

        IntHolder(int value) {
            this.value = value;
        }
    }

    public static void swap(IntHolder a, IntHolder b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        IntHolder x = new IntHolder(10);
        IntHolder y = new IntHolder(20);

        swap(x, y);

        System.out.println(x.value);
        System.out.println(y.value);
    }
}