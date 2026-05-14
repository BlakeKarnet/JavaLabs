package main.java.org.example.chapter02.task11;

import java.util.ArrayList;

public class RandomNumbers {
    public static int randomElement(int[] array) {
        int size = array.length;

        if (size == 0) {
            return 0;
        }

        int index = (int) (Math.random() * size);
        return array[index];
    }

    public static int randomElement(ArrayList<Integer> list) {
        int size = list.size();

        if (size == 0) {
            return 0;
        }

        int index = (int) (Math.random() * size);
        return list.get(index);
    }
}