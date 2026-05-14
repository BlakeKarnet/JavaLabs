package main.java.org.example.chapter01.task9;

public class CompareString {
    public static void main(String[] args) {
        String string1 = "AAA";
        String string2 = new String("AAA");
        System.out.println("string1 == string2: " + (string1 == string2));
        System.out.println("string1.equals(string2): " + string1.equals(string2));
    }
}