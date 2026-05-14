package main.java.org.example.chapter02.task16;

import main.java.org.example.chapter02.task16.Invoice;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();

        invoice.addItem("Laptop", 1, 1200);
        invoice.addItem("Mouse", 2, 25);
        invoice.addItem("Keyboard", 1, 80);

        invoice.print();
    }
}