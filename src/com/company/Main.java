package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            s=s.trim();
            if (s.length() > 21) { throw new ExceptionLengthSymbols(); }
            else {
                if(s.matches(".*\\d.*")){ new MathOperation(s);}
                else new RomanianOperation(s);
                }
            }
        }
    }

