package main.java.org.example.chapter03.task15;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Kirill", 100000),
                new Worker("Anna", 120000),
                new Worker("Max", 100000),
                new Worker("Oleg", 90000)
        };

        Arrays.sort(workers, Comparator.comparingDouble(Worker::getSalary).thenComparing(Worker::getName));

        System.out.println("Sorted:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        Arrays.sort(workers, Comparator.comparingDouble(Worker::getSalary).thenComparing(Worker::getName).reversed());

        System.out.println();

        System.out.println("Reversed:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}