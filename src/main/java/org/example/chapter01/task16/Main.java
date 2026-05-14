package main.java.org.example.chapter01.task16;

public class Main {
    public static void main(String[] args) {
        String s = """
                public class Main {
                    public static void main(String[] args) {
                        String s = \"""
                %s\s
                \""";
                        System.out.printf(s, s);
                    }
                }
                """;
        System.out.printf(s, s);
    }
}