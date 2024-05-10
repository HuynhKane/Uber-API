package com.vn.uberapi.exception;

public class DriverNotFoundException extends RuntimeException{
    public DriverNotFoundException(String message){
        super(message);
    }
    public DriverNotFoundException(String message, Throwable cause){
        super(message,cause);
    }
}
