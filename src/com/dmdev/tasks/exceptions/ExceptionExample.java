package com.dmdev.tasks.exceptions;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            unsafe(10);
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        System.out.println("main end");
    }

    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("Unsafe start");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("Unsafe end");
    }
}
