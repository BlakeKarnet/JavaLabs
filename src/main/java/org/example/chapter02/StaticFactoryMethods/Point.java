package main.java.org.example.chapter02.StaticFactoryMethods;

class Point {
    int x;
    int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static Point of(int x, int y) {
        return new Point(x, y);
    }

    static Point zero() {
        return new Point(0, 0);
    }
}