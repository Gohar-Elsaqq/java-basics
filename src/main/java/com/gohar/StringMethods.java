package com.gohar;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "  gohar";
//        boolean result =name.equals("goher");
//        boolean result =name.equalsIgnoreCase("gohar");
//        int result =name.length() ;
//        char result =name.charAt(3);
//        int result =name.indexOf('r');
//        boolean result=name.isEmpty();
//        String  result =name.toUpperCase();
//        String result=name.trim();
        String result =name.replace("o","a");

        System.out.println(result);
    }
}
