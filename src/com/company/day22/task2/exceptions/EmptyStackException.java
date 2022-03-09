package com.company.day22.task2.exceptions;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException(String message){
        super(message);
    }
}
