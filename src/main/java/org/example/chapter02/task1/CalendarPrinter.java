package main.java.org.example.chapter02.task1;

import java.time.LocalDate;

public class CalendarPrinter {
    public static void main(String[] args) {
        int month = 4;
        int year = 2026;

        printHeader();
        printMonth(month, year);
    }

    public static void printHeader() {
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static int getStartPosition(LocalDate date) {
        return date.getDayOfWeek().getValue() % 7;
    }

    public static void printMonth(int month, int year) {
        LocalDate date = LocalDate.of(year, month, 1);

        int start = getStartPosition(date);
        for (int i = 0; i < start; i++) {
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());

            if (date.getDayOfWeek().getValue() % 7 == 6) {
                System.out.println();
            }

            date = date.plusDays(1);
        }

        System.out.println();
    }
}