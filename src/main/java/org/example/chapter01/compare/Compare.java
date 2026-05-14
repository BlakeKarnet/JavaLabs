package main.java.org.example.chapter01.compare; //одно слово = 1 пакет

public class Compare {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s2 = "HelloWorld";

        String s3 = new String("Hello") + new String("World"); // intern(); тогда попадет в кучу
        String s5 = "Hello";
        String s6 = "World";

        String s4 = s5 + s6;

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s2.equals(s3): " + s2.equals(s3));
    }
}