package main.java.org.example.chapter03.FilteringIterator;

import java.util.List;

public class FilteringIteratorDemo {
    public static void run() {
        printEvenNumbers();
        printAllNumbers();
        printNothing();
        printPositiveEvenNumbers();
    }

    private static void printEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        FilteringIterator<Integer> iterator = FilteringIterator
                .fromIterator(numbers.iterator())
                .filter(number -> number % 2 == 0);

        System.out.println("Even numbers:");
        print(iterator);
    }

    private static void printAllNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        FilteringIterator<Integer> iterator = FilteringIterator
                .fromIterator(numbers.iterator())
                .filter(number -> true);

        System.out.println("All numbers:");
        print(iterator);
    }

    private static void printNothing() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        FilteringIterator<Integer> iterator = FilteringIterator
                .fromIterator(numbers.iterator())
                .filter(number -> false);

        System.out.println("Nothing:");
        print(iterator);
    }

    private static void printPositiveEvenNumbers() {
        List<Integer> numbers = List.of(-4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6);

        FilteringIterator<Integer> iterator = FilteringIterator
                .fromIterator(numbers.iterator())
                .filter(number -> number > 0)
                .filter(number -> number % 2 == 0);

        System.out.println("Positive even numbers:");
        print(iterator);
    }

    private static void print(FilteringIterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
    }
}
