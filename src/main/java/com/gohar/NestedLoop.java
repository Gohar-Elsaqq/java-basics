package com.gohar;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println("i: " + i + ", j: " + j);
//            }
//        }


        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";
        System.out.println("enter # of rows");
        rows = scanner.nextInt();
        System.out.println("enter # of columns");
        columns = scanner.nextInt();
        System.out.println("enter symbol to use : ");
        symbol = scanner.next();
        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}
