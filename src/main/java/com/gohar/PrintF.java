package com.gohar;

public class PrintF {

    //printf () = an optional method to control ,format, and display text to the console windows
    //           two arguments = format string+(object/variable/value)
    //           %[flags] [precision] [width] [conversion-character]

    public static void main(String[] args) {
        //%d is a format specifier used to format an integer.

//        System.out.printf("This is a format string %d",123);
        boolean myBoolean=true;
        char myChar ='@';
        String myString="gohar";
        int myInt = 333;
        double myDouble =1000000;
//        System.out.printf("\n This is a character value %c",myChar);
//        System.out.printf("\n This is a string value %s",myString);
//        System.out.printf("\n This is an integer value %d",myInt);
//        System.out.printf("\n This is a double value %f",myDouble);
//        System.out.printf("\n This is a boolean value %b",myBoolean);
//        System.out.printf("\n This is a boolean value %s",!myBoolean?"True":"False");

        //[width]
        //minimum number of characters to be written as output
        System.out.printf("Hello %10s",myString);
        System.out.printf("\n--------------------------\n");
        //[precision]
        //sets number of digits of precision when output floating-point values
        System.out.printf("you have this much money %.2f",myDouble);
        System.out.printf("\n--------------------------\n");
        //[flags]
        //adds an effect to output based on the flag  added to format specifier
        // - : left-justify
        // + : output a plus (+) or minus (-) sing for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("you have this much money %020f",myDouble);
        System.out.printf("\n--------------------------\n");
        System.out.printf("you have this much money %.2f",myDouble);
        System.out.printf("\n--------------------------\n");
        System.out.printf("you have this much money %,f",myDouble);


    }

}
