package main.java.org.example.chapter03.task11;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File dir = new File(".");

        File[] dirs1 = dir.listFiles(file -> file.isDirectory());

        System.out.println("Lambda FileFilter:");
        for (File f : dirs1) {
            System.out.println(f.getName());
        }

        System.out.println();

        String[] dirs2 = dir.list((d, name) -> new File(d, name).isDirectory());

        System.out.println("Lambda FilenameFilter:");
        for (String name : dirs2) {
            System.out.println(name);
        }

        System.out.println();

        File[] dirs3 = dir.listFiles(File::isDirectory);

        System.out.println("Method reference:");
        for (File f : dirs3) {
            System.out.println(f.getName());
        }
    }
}