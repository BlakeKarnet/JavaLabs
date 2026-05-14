package main.java.org.example.chapter02.task7;

/**
 * IntelliJ IDEA умеет генерировать:
 * Constructor
 * Getter
 * Setter
 * toString
 * equals
 * hashCode
 *
 * Использовать:
 * Alt + Insert
 * или Code -> Generate
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}