package main.java.org.example.chapter03.task01;

public interface Measurable {
    double getMeasure();

    static double average(Measurable[] objects) {
        int size = objects.length;
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }

        return sum / size;
    }

    static Measurable largest(Measurable[] objects) {
        if (objects.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        Measurable largest = objects[0];
        for (Measurable object : objects) {
            if (object.getMeasure() > largest.getMeasure()) {
                largest = object;
            }
        }
        return largest;
    }
}

