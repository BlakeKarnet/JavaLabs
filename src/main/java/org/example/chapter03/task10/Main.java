package main.java.org.example.chapter03.task10;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task 1: " + i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task 2: " + i);
            }
        };

        Runnable task3 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task 3: " + i);
            }
        };

        System.out.println("Run in order:");
        TaskRun.runInOrder(task1, task2, task3);

        System.out.println();

        System.out.println("Run together:");
        TaskRun.runTogether(task1, task2, task3);
    }
}