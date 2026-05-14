package main.java.org.example.chapter01.task19;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> lines = new ArrayList<>();

        System.out.println("Input lines of square: ");

        while (true) {
            String line = scanner.nextLine();

            if (line.isEmpty()) break;

            String[] numStr = line.split(" ");
            int[] numbers = new int[numStr.length];

            for (int i = 0; i < numStr.length; i++) {
                numbers[i] = Integer.parseInt(numStr[i]);
            }
            lines.add(numbers);
        }

        scanner.close();

        if (!isSquare(lines)) {
            System.out.println("Not a square");
            return;
        }

        int n = lines.size();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = lines.get(i);
        }

        if (isMagicSquare(matrix)) {
            System.out.println("Magic Square");
        } else {
            System.out.println("Not a Magic Square");
        }
    }

    private static boolean isSquare(List<int[]> lines) {
        if (lines.isEmpty()) return false;

        int size = lines.size();
        for (int[] line : lines) {
            if (line.length != size) return false;
        }
        return true;
    }

    private static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;

        int targetSum = 0;
        for (int j = 0; j < n; j++) {
            targetSum += matrix[0][j];
        }

        for (int i = 0; i < n; i++) {
            int lineSum = 0;
            for (int j = 0; j < n; j++) {
                lineSum += matrix[i][j];
            }
            if (lineSum != targetSum) {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != targetSum) {
                return false;
            }
        }

        int mainDiagSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagSum += matrix[i][i];
        }
        if (mainDiagSum != targetSum) {
            return false;
        }

        int secondaryDiagSum = 0;
        for (int i = 0; i < n; i++) {
            secondaryDiagSum += matrix[i][n - 1 - i];
        }
        if (secondaryDiagSum != targetSum) {
            return false;
        }

        return true;
    }
}

