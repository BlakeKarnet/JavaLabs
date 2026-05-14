package main.java.org.example.chapter01.task4;

import java.util.Scanner;

public class FindTheMost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number:");

        System.out.println("Number one: ");
        int num1 = scanner.nextInt();
        System.out.println("Number two: ");
        int num2 = scanner.nextInt();
        System.out.println("Number three: ");
        int num3 = scanner.nextInt();

        int max = (num1 > num2) ?
                ((num1 > num3) ? num1 : num3) :
                ((num2 > num3) ? num2 : num3);

        int maxMath = Math.max(Math.max(num1, num2), num3);

        System.out.println("Input numbers: " + num1 + ", " + num2 + ", " + num3 + "\n");
        System.out.println("Max num: " + max + "\n");
        System.out.println("Max numMath: " + maxMath + "\n");

        scanner.close();
    }
}