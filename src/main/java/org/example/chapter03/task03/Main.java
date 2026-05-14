package main.java.org.example.chapter03.task03;

public class Main {
    public static void main(String[] args) {
        printSupertypes("String", new String[]{
                "String",
                "Object",
                "Serializable",
                "Comparable<String>",
                "CharSequence",
                "Constable",
                "ConstantDesc"
        });

        printSupertypes("Scanner", new String[]{
                "Scanner",
                "Object",
                "Iterator<String>",
                "Closeable",
                "AutoCloseable"
        });

        printSupertypes("ImageOutputStream", new String[]{
                "ImageOutputStream",
                "ImageInputStream",
                "DataOutput",
                "DataInput",
                "Closeable",
                "Flushable",
                "AutoCloseable",
                "Object"
        });
    }

    public static void printSupertypes(String typeName, String[] supertypes) {
        System.out.println("Supertypes of " + typeName + ":");

        for (String supertype : supertypes) {
            System.out.println(supertype);
        }

        System.out.println();
    }
}