package com.company;

import java.util.List;

public class MathOperation {

    public MathOperation(String s) throws ExceptionIncorrectSymbolOperation {
        if(s.contains("+")){String [] w=s.split("\\+"); parseNumber(w,"Sum");}
           else if(s.contains("/")){String [] w=s.split("/"); parseNumber(w,"Del");}
           else if(s.contains("*")){String [] w=s.split("\\*"); parseNumber(w,"Incr");}
           else if(s.contains("-")){String [] w=s.split("-"); parseNumber(w,"Min");}
           else throw new ExceptionIncorrectSymbolOperation();
    }


    public void parseNumber(String []s,String key){
        long a=Long.parseLong(s[0]);
        long b=Long.parseLong(s[1]);
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
