package main.java.org.example.chapter01.task8;

import java.util.Scanner;

public class NonemptyString {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input = str.nextLine();

        String[] parts = input.split(" ");
        for (String part : parts) {
            if (!part.isEmpty()) {
                System.out.println(part);
            }
        }
    }
}