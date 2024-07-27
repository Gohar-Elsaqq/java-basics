package com.gohar;

public class JavaMethods {
    //methods = a block of code that is executed whenever it is called upon
    public static void main(String[] args) {
        String name = "gohar";
        hello(name);
        hello();
       int z= add(3,5);
        System.out.println(z);
    }
    static void hello(){
        System.out.println("hello :");
    }
     static void hello(String name){
        System.out.println("hello : " + name);
    }
    static int add(int a, int b){
        return  a+b;

    }
}
