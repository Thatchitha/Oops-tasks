package org.example;

public class CancellationNotAllowedException extends Exception{
    public CancellationNotAllowedException(String message) {
        super(message);
    }
}
