package com.bertan.exception;

import lombok.Getter;

@Getter
public class KitapcimException extends RuntimeException{
    private final ErrorType errorType;
    public KitapcimException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }
    public KitapcimException(ErrorType errorType, String message){
        super(message);
        this.errorType=errorType;
    }
}
