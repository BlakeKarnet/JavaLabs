package main.java.org.example.chapter01.task1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int num = scanner.nextInt();

        System.out.println("0-1 system: " + Integer.toBinaryString(num));
        System.out.println("0-7 system: " + Integer.toOctalString(num));
        System.out.println("0-F: " + Integer.toHexString(num).toUpperCase());

        scanner.close();
    }
}