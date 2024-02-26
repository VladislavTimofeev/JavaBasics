package com.dmdev.tasks.exceptions;

/**
 * 4. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */
public class Task4 {

    public static void main(String[] args) {
        try {
            catchCustomException();
        }catch (ExceptionHandler exceptionHandler){
            System.out.println("catch in main");
            exceptionHandler.printStackTrace();
        }
    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("catch in catchCustomException method");
            throw new ExceptionHandler(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Oooops");
    }
}
