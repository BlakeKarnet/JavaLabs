package main.java.org.example.chapter01.task21;

public class Average {

    public static double average(int first, int... rest) {
        int sum = first;

        for (int num : rest) {
            sum += num;
        }

        return (double) sum / (1 + rest.length);
    }

    public static void main(String[] args) {
        System.out.println(average(5));           // 5.0
        System.out.println(average(2, 4));        // 3.0
        System.out.println(average(1, 2, 3, 4));  // 2.5
    }
}