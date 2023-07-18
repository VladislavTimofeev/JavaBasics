package com.dmdev.tasks.lesson4;

/**
 * Generics
 */
public class List<T> {

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
}
