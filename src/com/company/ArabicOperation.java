package com.company;

import java.util.List;

public class ArabicOperation {

    public ArabicOperation(String s) throws ExceptionIncorrectSymbolOperation, ExceptionMaxNumber {
        if(s.contains("+")){String [] w=s.split("\\+"); parseNumber(w,"Sum");}
           else if(s.contains("/")){String [] w=s.split("/"); parseNumber(w,"Del");}
           else if(s.contains("*")){String [] w=s.split("\\*"); parseNumber(w,"Incr");}
           else if(s.contains("-")){String [] w=s.split("-"); parseNumber(w,"Min");}
           else throw new ExceptionIncorrectSymbolOperation();
    }


    public void parseNumber(String []s,String key) throws ExceptionMaxNumber {
        long a=Long.parseLong(s[0]);
        long b=Long.parseLong(s[1]);
        if(a>10||b>10){throw new ExceptionMaxNumber();}
        long c = switch (key) {
            case "Sum" -> a + b;
            case "Del" -> a / b;
            case "Incr" -> a * b;
            case "Min" -> a - b;
            default -> 0;
        };
        System.out.println(c);


    }
}
