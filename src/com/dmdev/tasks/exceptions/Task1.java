package com.dmdev.tasks.exceptions;

/**
 * 1. Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 *
 * Так делать нельзя, мы это делаем только для задания.
 */
public class Task1 {
    public static void main(String[] args) {
        String value = null;
        try {
            value.length();
        } catch (NullPointerException exception) {
            System.err.println("catch");
            exception.printStackTrace();
        }
    }
}
