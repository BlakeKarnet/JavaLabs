package main.java.org.example.chapter02.task5;

/**
 * Представляет неизменяемую точку в двумерном пространстве.
 *
 * @param x координата X точки
 * @param y координата Y точки
 */
public record Point(double x, double y) {

    /*
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    record Point(int x, int y) {
        public Point {
            if (x < 0 || y < 0) {
                throw new IllegalArgumentException();
            }
        }
    }
     */

    /**
     * Создаёт новую точку, смещённую относительно текущей.
     *
     * @param dx смещение по оси X
     * @param dy смещение по оси Y
     * @return новый объект Point с координатами (x + dx, y + dy)
     */
    public Point translate(double dx, double dy) {
        return new Point(this.x + dx, this.y + dy);
    }

    /**
     * Создаёт новую точку с масштабированными координатами.
     *
     * @param factor коэффициент масштабирования
     * @return новый объект Point с координатами (x * factor, y * factor)
     */
    public Point scale(double factor) {
        return new Point(this.x * factor, this.y * factor);
    }
}