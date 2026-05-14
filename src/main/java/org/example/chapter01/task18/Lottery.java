package main.java.org.example.chapter01.task18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) numbers.add(i);

        ArrayList<Integer> result = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 6; i++) {
            result.add(numbers.remove(rnd.nextInt(numbers.size())));
        }

        Collections.sort(result);
        System.out.println(result);
    }
};