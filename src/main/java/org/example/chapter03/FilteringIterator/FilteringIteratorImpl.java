package main.java.org.example.chapter03.FilteringIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class FilteringIteratorImpl<T> implements FilteringIterator<T> {
    private final Iterator<T> source;
    private final Predicate<T> predicate;
    private T nextElement;
    private boolean nextElementReady;

    public FilteringIteratorImpl(Iterator<T> source, Predicate<T> predicate) {
        this.source = source;
        this.predicate = predicate;
    }

    @Override
    public boolean hasNext() {
        if (nextElementReady) {
            return true;
        }

        while (source.hasNext()) {
            T element = source.next();

            if (predicate.test(element)) {
                nextElement = element;
                nextElementReady = true;
                return true;
            }
        }

        return false;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        T result = nextElement;
        nextElement = null;
        nextElementReady = false;

        return result;
    }

    @Override
    public FilteringIterator<T> filter(Predicate<T> predicate) {
        return new FilteringIteratorImpl<>(this, predicate);
    }
}
