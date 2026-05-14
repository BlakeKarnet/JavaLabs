package main.java.org.example.chapter01.task7;

import java.util.Scanner;

public class IntCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        String firstNum = scanner.next();
        int firstNumInt = Integer.parseUnsignedInt(firstNum);

        System.out.println("\n" + "Input 2nd number: ");
        String secondNum = scanner.next();
        int secondNumInt = Integer.parseUnsignedInt(secondNum);

        int sum = firstNumInt + secondNumInt;
        System.out.println("\n" + Integer.toUnsignedString(sum));

        int diff = firstNumInt - secondNumInt;
        System.out.println("\n" + Integer.toUnsignedString(diff));

        int product = firstNumInt * secondNumInt;
        System.out.println("\n" + Integer.toUnsignedString(product));

        int quotient;
        int remainder;

        if (firstNumInt > secondNumInt) {
            quotient = firstNumInt / secondNumInt;
            remainder = firstNumInt % secondNumInt;
        } else {
            quotient = secondNumInt / firstNumInt;
            remainder = secondNumInt % firstNumInt;
        }

        System.out.println("\n" + Integer.toUnsignedString(quotient) + "\n" + Integer.toUnsignedString(remainder));
    }
}