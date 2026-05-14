package main.java.org.example.chapter01.task13;

import java.util.Scanner;

//тдельный класс маин

public class Compass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int y = 0;

        String direction = getDirection(scanner);
        updateCoordinates(direction, x, y);

        scanner.close();
    }

    private static String getDirection(Scanner scanner) {
        System.out.print("Input turn (N, S, E, W): ");
        return scanner.nextLine();
    }

    private static void updateCoordinates(String direction, int x, int y) {
        switch (direction) {
            case "N" -> y++;
            case "S" -> y--;
            case "E" -> x++;
            case "W" -> x--;
            default -> System.out.println("Invalid turn");
        }

        System.out.println("x = " + x + ", y = " + y);
    }
}