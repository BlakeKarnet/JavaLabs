package main.java.org.example.chapter02.task6;

/**
 * Представляет изменяемую точку на плоскости.
 */
public class Point {
    private double x;
    private double y;

    /**
     * Создает точку с заданными координатами.
     *
     * @param x координата X
     * @param y координата Y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату X.
     *
     * @return значение X
     */
    public double getX() {
        return x;
    }

    /**
     * Возвращает координату Y.
     *
     * @return значение Y
     */
    public double getY() {
        return y;
    }

    /**
     * Сдвигает точку на заданные значения.
     *
     * @param dx смещение по X
     * @param dy смещение по Y
     */
    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    /**
     * Масштабирует точку.
     *
     * @param factor коэффициент масштабирования
     */
    public void scale(double factor) {
        x *= factor;
        y *= factor;
    }

    /**
     * Возвращает строку с координатами точки.
     *
     * @return координаты точки
     */
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}