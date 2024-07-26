package com.gohar;

import java.util.ArrayList;

public class ArrayLists {
    //Array List = a resizable array.
    // element type can be added and removed after compilation phase store reference data type.
    public static void main(String[] args){

    ArrayList<String> food =new ArrayList<String>();
    food.add("pizza");
    food.add("burger");
    food.add("fries");
    food.set(0,"Apple");
    food.remove(2);
    food.clear();
        System.out.println("clear all elements");
        System.out.println("___________________________");
    for(int i =0; i<food.size();i++){
        System.out.println(food.get(i));
    }
}
}