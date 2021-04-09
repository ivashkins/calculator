package com.company;

import java.lang.reflect.Executable;

public class ExceptionLengthSymbols extends Exception{
    private static String s="To much symbols/ no more 21";
    public ExceptionLengthSymbols(){
        super(s);
    }
}
