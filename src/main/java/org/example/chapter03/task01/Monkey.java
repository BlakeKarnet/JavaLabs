package main.java.org.example.chapter03.task01;

public class Monkey implements Measurable {
    private String name;
    private int bananas;

    public Monkey(String name, int bananas) {
        this.name = name;
        this.bananas = bananas;
    }

    @Override
    public double getMeasure() {
        return bananas;
    }

    public String getName () { return name; }
}