package com.gohar;

public class JavaMethods {
    //methods = a block of code that is executed whenever it is called upon
    public static void main(String[] args) {
        String name = "gohar";
        hello(name);
        hello();
    }
    static void hello(){
        System.out.println("hello :");
    }
     static void hello(String name){
        System.out.println("hello : " + name);
    }
}
