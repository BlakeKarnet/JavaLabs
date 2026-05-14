package main.java.org.example.chapter01.task11;

import java.util.Scanner;

public class CheckASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("Input string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); ++i) {
            char iChar = input.charAt(i);

            if (iChar > 127) {
                found = true;
                System.out.printf("Символ: '%c' | Десятичный: %d | Шестнадцатеричный: U+%04X%n",
                        iChar, (int)iChar, (int)iChar);
            }
        }

        if (!found) System.out.println("NoASCII chars");
        scanner.close();
    }
}