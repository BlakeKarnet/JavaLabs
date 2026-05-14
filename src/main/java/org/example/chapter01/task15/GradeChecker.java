package main.java.org.example.chapter01.task15;

public class GradeChecker {
    public static void main(String[] args) {
        String grade = "B";
        String message = "";

        switch (grade) {
            case "A+":
                message = "Превосходно! ";
            case "A":
                message += "Отлично! ";
            case "B":
                message += "Хорошо. ";
                break;
            case "C":
                message = "Удовлетворительно.";
                break;
            case "D":
                message = "Плохо.";
                break;
            default:
                message = "Неизвестная оценка.";
        }

        System.out.println(message);
    }
}