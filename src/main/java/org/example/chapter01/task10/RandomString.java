package main.java.org.example.chapter01.task10;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
        Random random = new Random();

        long randomLong = random.nextLong();

        String randomString = Long.toString(randomLong, 36);

        System.out.println("Random string: " + randomString);
    }
}