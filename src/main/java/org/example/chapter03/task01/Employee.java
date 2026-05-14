package main.java.org.example.chapter03.task01;

public class Employee implements Measurable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName () { return name; }
}
