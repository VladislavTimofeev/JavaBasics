package com.dmdev.tasks.exceptions;

/**
 * 3. Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в консоль.
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (ExceptionHandler exceptionHandler) {
            System.out.println(exceptionHandler.getMessage());
            System.out.println(exceptionHandler.getCause());
            exceptionHandler.printStackTrace();
        }
    }

    public static void unsafe() throws ExceptionHandler {
        throw new ExceptionHandler(new RuntimeException("runtime exception"));
    }
}
