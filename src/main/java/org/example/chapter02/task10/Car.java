/*
Нужно спроектировать класс Car, у которого есть состояние:

текущая координата по оси x
количество топлива
расход, точнее экономичность miles per gallon

И методы:

проехать заданное число миль
заправить заданное число галлонов
получить текущую дистанцию от начала
получить текущий уровень топлива

Укажите топливную экономичность (в милях на галлон) в конструкторе.
Должен ли этот класс быть неизменяемым? Почему или почему нет?
 */

package main.java.org.example.chapter02.task10;

public class Car {
    private double x;
    private double fuel;
    private final double mpg;

    public Car(double mpg) {
        if (mpg <= 0) {
            throw new IllegalArgumentException("MPG must be positive");
        }
        this.x = 0;
        this.fuel = 0;
        this.mpg = mpg;
    }

    public void drive(double miles) {
        if (miles < 0) {
            throw new IllegalArgumentException("Miles can`t be negative");
        }

        double needFuel = miles / mpg;

        if (needFuel < fuel) {
            x += miles;
            fuel -= needFuel;
        } else {
            x += fuel * mpg;
            fuel = 0;
        }
    }

    public void addFuel(double gallons) {
        if (gallons < 0) {
            throw new IllegalArgumentException("Gallons must be positive");
        }

        fuel += gallons;
    }

    public double getX() {
        return x;
    }

    public double getFuel() {
        return fuel;
    }
}