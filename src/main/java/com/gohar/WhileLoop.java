package com.gohar;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        //while loop =
//        Scanner scanner= new Scanner(System.in);
//        String  name="";
//       do {
//           System.out.print("Enter your name: ");
//           name = scanner.nextLine();
//       }
//       while (name.isBlank());
//        System.out.println("Hello "+name);
//    }
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int attempts = 0;

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            attempts++;

            if (attempts >= 3 && name.isBlank()) {
                throw new RuntimeException("Too many invalid attempts.");
            }

        } while (name.isBlank());

        System.out.println("Hello " + name);
    }
}
