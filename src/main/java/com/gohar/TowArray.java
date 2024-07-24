package com.gohar;

public class TowArray {
    public static void main(String[] args) {

        String[][] cars = new String[3][3];
        cars[0][0] = "camaro";
        cars[0][1] = "bmw";
        cars[0][2] = "toyota";
        cars[1][0] = "camaro";
        cars[1][1] = "bmw";
        cars[1][2] = "toyota";
        cars[2][0] = "camaro";
        cars[2][1] = "bmw";
        cars[2][2] = "toyota";


        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++){

                System.out.print(cars[i][j]+" : ");

            }
        }

    }
}
