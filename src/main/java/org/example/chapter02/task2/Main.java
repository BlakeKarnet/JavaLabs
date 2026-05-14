package main.java.org.example.chapter02.task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner("25 40");
        int a = in.nextInt();

        Random random = new Random();
        int b = random.nextInt(100);

        System.out.println(a);
        System.out.println(b);
    }
}