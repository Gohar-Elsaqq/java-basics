package com.gohar;

public class Arrays {
    public static void main(String[] args) {


//        String[] cars = {"camaro", "bmw", "toyota"};
//        cars[0] = "tesla";
//        System.out.println(cars[0]);

        String[] cars = new String[3];
        cars[0] = "camaro";
        cars[1] = "bmw";
        cars[2] = "toyota";
        //Index 3 out of bounds for length 3
        //cars[3]="ffff";
            for (int i=0;i< cars.length;i++){
                System.out.println(cars[i]);
            }
    }

}