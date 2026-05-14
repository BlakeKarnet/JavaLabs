package main.java.org.example.chapter03.task08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Tom");
        strings.add("Bob");
        strings.add("Alice");
        strings.add("Kate");

        System.out.println("Before sorting:");
        System.out.println(strings);

        LuckySort.luckySort(strings, String::compareTo);

        System.out.println("After sorting:");
        System.out.println(strings);
    }
}