package main.java.org.example.chapter01.task2;

import java.util.Scanner;

public class CorrectAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input angle");
        int angle = scanner.nextInt();

        int nAngle = angle % 360;
        if (nAngle < 0) nAngle += 360;

        int mAngle = Math.floorMod(angle, 360);

        System.out.println("Input angle:" + angle + "\n");
        System.out.println("Correct angle (%):" + nAngle + "\n");
        System.out.println("Correct angle (floorMod):" + mAngle + "\n");

        scanner.close();
    }
}