package com.company;

import java.util.List;

public class RomanianOperation {
    public RomanianOperation(String s) throws ExceptionIncorrectSymbolOperation {
        if(s.contains("+")){String [] w=s.split("\\+"); romanianParse(w,"Sum");}
        else if(s.contains("/")){String [] w=s.split("/"); romanianParse(w,"Del");}
        else if(s.contains("*")){String [] w=s.split("\\*"); romanianParse(w,"Incr");}
        else if(s.contains("-")){String [] w=s.split("-"); romanianParse(w,"Min");}
        else throw new ExceptionIncorrectSymbolOperation();

    }
    public static long romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        long result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }

        return result;
    }
    public static String arabicToRoman(long number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }

    public void romanianParse(String []w,String key){
        long a=romanToArabic(w[0]);
        long b=romanToArabic(w[1]);
        long c = switch (key) {
            case "Sum" -> a + b;
            case "Del" -> a / b;
            case "Incr" -> a * b;
            case "Min" -> a - b;
            default -> 0;
        };
        String z=arabicToRoman(c);
        System.out.println(z);

    }
}
