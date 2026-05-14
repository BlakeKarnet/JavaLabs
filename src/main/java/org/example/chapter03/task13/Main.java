package main.java.org.example.chapter03.task13;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        File dir = new File(".");
        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Directory is empty");
            return;
        }

        Arrays.sort(files, (a, b) -> {
            if (a.isDirectory() && !b.isDirectory()) return -1;
            if (!a.isDirectory() && b.isDirectory()) return 1;
            return a.getName().compareTo(b.getName());
        });

        System.out.println("Lambda:");
        for (File f : files) {
            System.out.println(f.getName());
        }

        System.out.println();

        Arrays.sort(files, Comparator.comparing(File::isDirectory).reversed().thenComparing(File::getName));

        System.out.println("Method reference:");
        for (File f : files) {
            System.out.println(f.getName());
        }

        System.out.println();

        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File a, File b) {

                if (a.isDirectory() && !b.isDirectory()) {
                    return -1;
                }

                if (!a.isDirectory() && b.isDirectory()) {
                    return 1;
                }

                return a.getName().compareTo(b.getName());
            }
        });

        System.out.println("Anonymous class:");
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}