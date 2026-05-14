package main.java.org.example.chapter03.task06;

public interface Sequence<T> {
    boolean hasNext();
    T next();
}