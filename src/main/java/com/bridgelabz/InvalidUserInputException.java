package com.bridgelabz;

@SuppressWarnings("serial")
public class InvalidUserInputException extends Exception{
    ExceptionType type;
    enum ExceptionType{
        ENTERED_INVALID,ENTERED_NULL
    }
    public InvalidUserInputException(ExceptionType type,String message){
        super(message);
        this.type=type;
    }
}