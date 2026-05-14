package main.java.org.example.chapter01.task20;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = getNumberOfRows(scanner);
        ArrayList<ArrayList<Integer>> triangle = generatePascalsTriangle(n);

        displayResults(n, triangle);

        scanner.close();
    }

    private static int getNumberOfRows(Scanner scanner) {
        System.out.print("Введите n (количество строк треугольника Паскаля): ");
        return scanner.nextInt();
    }

    private static ArrayList<ArrayList<Integer>> generatePascalsTriangle(int n) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = generateRow(triangle, i);
            triangle.add(row);
        }

        return triangle;
    }

    private static ArrayList<Integer> generateRow(ArrayList<ArrayList<Integer>> triangle, int rowIndex) {
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);

        if (rowIndex > 0) {
            ArrayList<Integer> previousRow = triangle.get(rowIndex - 1);

            for (int j = 1; j < rowIndex; j++) {
                int value = previousRow.get(j - 1) + previousRow.get(j);
                row.add(value);
            }

            row.add(1);
        }

        return row;
    }

    private static void displayResults(int n, ArrayList<ArrayList<Integer>> triangle) {
        System.out.println("\nТреугольник Паскаля для n = " + n + ":");
        printTriangle(triangle);

        System.out.println("\nВ виде ArrayList:");
        System.out.println(triangle);
    }

    private static void printTriangle(ArrayList<ArrayList<Integer>> triangle) {
        int n = triangle.size();
        int maxWidth = calculateMaxWidth(triangle);

        for (int i = 0; i < n; i++) {
            printRowWithIndent(triangle, i, n, maxWidth);
        }
    }

    private static int calculateMaxWidth(ArrayList<ArrayList<Integer>> triangle) {
        int maxNumber = 0;
        for (ArrayList<Integer> row : triangle) {
            for (int num : row) {
                maxNumber = Math.max(maxNumber, num);
            }
        }
        return String.valueOf(maxNumber).length() + 1;
    }

    private static void printRowWithIndent(ArrayList<ArrayList<Integer>> triangle, int rowIndex, int totalRows, int maxWidth) {
        int indent = (totalRows - rowIndex - 1) * maxWidth / 2;
        System.out.print(" ".repeat(indent));

        ArrayList<Integer> row = triangle.get(rowIndex);
        for (int num : row) {
            System.out.printf("%" + maxWidth + "d", num);
        }
        System.out.println();
    }
}