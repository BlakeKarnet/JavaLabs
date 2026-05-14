package main.java.org.example.chapter03.FilteringIterator;

import java.util.Iterator;
import java.util.function.Predicate;

public interface FilteringIterator<T> extends Iterator<T> {
    static <T> FilteringIterator<T> fromIterator(Iterator<T> iterator) {
        return new FilteringIteratorImpl<>(iterator, value -> true);
    }
    FilteringIterator<T> filter(Predicate<T> predicate);
}