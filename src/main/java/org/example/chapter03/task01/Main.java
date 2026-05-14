import main.java.org.example.chapter03.task01.Employee;
import main.java.org.example.chapter03.task01.Measurable;
import main.java.org.example.chapter03.task01.Monkey;

public static void main(String[] args) {
    Employee[] staff = {
            new Employee("Ivan", 50000),
            new Employee("Anna", 75000),
            new Employee("Max", 62000)
    };

    Monkey[] monkeys = {
            new Monkey("Bibi", 100),
            new Monkey("Arisha", 200),
    };

    Measurable largestMonk = Measurable.largest(monkeys);
    Measurable largest = Measurable.largest(staff);

    Monkey happines = (Monkey) largestMonk;
    Employee richest = (Employee) largest;

    System.out.println(richest.getName());
    System.out.println(happines.getName());
}