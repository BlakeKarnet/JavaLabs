package main.java.org.example.chapter02.task16;

import java.util.ArrayList;

public class Invoice {
    private static class Item {
        String description;
        int quantity;
        double unitPrice;

        double price() {
            return quantity * unitPrice;
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item item = new Item();
        item.description = description;
        item.quantity = quantity;
        item.unitPrice = unitPrice;
        items.add(item);
    }

    public void print() {
        double total = 0;

        for (Item item : items) {
            System.out.println(
                    item.description + " " +
                            item.quantity + " " +
                            item.unitPrice + " " +
                            item.price()
            );

            total += item.price();
        }

        System.out.println("Total: " + total);
    }
}