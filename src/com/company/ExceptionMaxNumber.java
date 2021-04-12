package com.company;


public class ExceptionMaxNumber extends Exception{
    private static String s="Number can't be more than 10";
    public ExceptionMaxNumber() {
        super(s);
    }
}