package com.dmdev.tasks.exceptions;

public class ExceptionHandler extends RuntimeException {

    public ExceptionHandler(String message) {
        super(message);
    }

    public ExceptionHandler(Throwable cause) {
        super(cause);
    }
}
