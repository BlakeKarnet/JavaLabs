package main.java.org.example.chapter03.task14;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("Task 1");
        Runnable task2 = () -> System.out.println("Task 2");
        Runnable task3 = () -> System.out.println("Task 3");

        Runnable allTasks = RunUtil.inOrder(task1, task2, task3);

        allTasks.run();
    }
}