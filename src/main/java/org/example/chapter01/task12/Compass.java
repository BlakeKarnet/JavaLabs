package main.java.org.example.chapter01.task12;

import java.util.Scanner;

public class Compass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dir = scanner.nextLine();

        int[] offset = switch (dir) {
            case "N" -> new int[] {0, 1};
            case "S" -> new int[] {0, -1};
            case "E" -> new int[] {1, 0};
            case "W" -> new int[] {-1, 0};
            default -> throw new IllegalArgumentException();
        };
        System.out.println(offset[0] + " " + offset[1]);
    }
}