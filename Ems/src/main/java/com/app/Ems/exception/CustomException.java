package com.app.Ems.exception;

public class CustomException extends RuntimeException {

    private String message;
    private Throwable cause;

    public CustomException(){
        super();
    }

    public CustomException(String errMsg){
        super(errMsg);
        this.message = errMsg;

    }

    public CustomException(String errMsg, Throwable trace){
        super(errMsg,trace);
        this.message = errMsg;
        this.cause = trace;
    }

}
