package org.example.uber.expections;

public class RuntimeConflictException extends RuntimeException {

    public RuntimeConflictException() {

    }

    public RuntimeConflictException(String message) {
        super(message);
    }
}
