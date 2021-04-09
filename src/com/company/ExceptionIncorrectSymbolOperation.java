package com.company;

public class ExceptionIncorrectSymbolOperation extends Exception{
    private static String s="Incorrect symbol in terminal";

    public ExceptionIncorrectSymbolOperation() {
        super(s);
    }
}
