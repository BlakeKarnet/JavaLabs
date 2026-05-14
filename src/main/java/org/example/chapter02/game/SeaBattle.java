package main.java.org.example.chapter02.game;

import java.util.Scanner;

public class SeaBattle {
    int readCoordinates(Scanner scanner, char name) {
        System.out.print("Enter " + name + ":\n");
        while (!scanner.hasNextInt()) {
            System.out.print("Wrong input. Enter integer " + name + ":\n");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public void playGame() {
        Board board = new Board();
        board.autoPlaceShips();

        Scanner scanner = new Scanner(System.in);

        while (!board.allShipsDestroyed()) {
            board.printShotsBox();

            int x = readCoordinates(scanner, 'X');
            int y = readCoordinates(scanner, 'Y');

            ShootResult result = board.shoot(x, y);
            System.out.println("Shoot Result: " + result);
        }

        System.out.println("You win!!!");
        scanner.close();
    }
}