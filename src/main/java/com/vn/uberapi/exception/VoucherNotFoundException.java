package com.vn.uberapi.exception;

public class VoucherNotFoundException extends RuntimeException{
    public VoucherNotFoundException(String message){
        super(message);
    }
    public VoucherNotFoundException(String message, Throwable cause){
        super(message,cause);
    }
}

