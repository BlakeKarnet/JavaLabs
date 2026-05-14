/*
Реализуйте запись TimeOfDay с компонентами час и минута.
Нормализуйте их так, чтобы час был в диапазоне от 0 до 23, а минута — от 0 до 59.
Предоставьте метод TimeOfDay plusMinutes(int minutes), который возвращает новый объект TimeOfDay,
смещенный на указанное количество минут, и метод int minutesFrom(TimeOfDay other),
который возвращает количество минут между текущим и заданным экземпляром TimeOfDay.
*/

package main.java.org.example.chapter02.task9;

public record TimeOfDay(int hour, int minute) {

    public TimeOfDay {
        int total = (hour % 24) * 60 + minute;
        total = (total % 1440 + 1440) % 1440;
        hour = total / 60;
        minute = total % 60;
    }

    public TimeOfDay plusMinutes(int minutes) {
        return new TimeOfDay(hour, minute + minutes);
    }

    public int minutesFrom(TimeOfDay other) {
        return (hour * 60 + minute) - (other.hour * 60 + other.minute);
    }
}