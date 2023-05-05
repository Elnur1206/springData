package com.example.springdata.exception;

public class UserNotFoundExceprion extends RuntimeException{

    public UserNotFoundExceprion(String message) {
        super(message);
    }
}
