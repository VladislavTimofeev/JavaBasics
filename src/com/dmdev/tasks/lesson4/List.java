package com.dmdev.tasks.lesson4;

import java.util.Iterator;

/**
 * Generics
 */
public class List<T> implements Iterable<T> {

    private T[] objects; // используется обджект так как мы хотим добавить любой элемент( объект ) в массив (String, int etc )
    private int size;

    public List(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}
