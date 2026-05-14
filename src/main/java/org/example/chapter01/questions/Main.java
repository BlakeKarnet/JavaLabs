package main.java.org.example.chapter01.questions;

public class Main {
    static void main() {
        String result = "";
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
        }
    }
}
