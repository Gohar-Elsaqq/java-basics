package com.gohar;

public class Overloaded {
    //overload methods = methods that share the same but have different parameter
    //                  methods name + parameters = method signature.

    public static void main(String[] args) {
        int resultint = add(1,2,3,4);
        System.out.println(resultint);

        double result1 = add(1.1,1.2,1.3,1.2);

        System.out.println(result1);

    }
    static int add (int x, int y){
        System.out.println("This is overloaded method #1");
        return x+y;
    }

     static  int add(int x, int y,int z) {
         System.out.println("This is overloaded method #2");
        return x+y+z;
    }
    static  int add(int a, int b,int c,int d) {
        System.out.println("This is overloaded method #3");
        return a+b+c+d;
    }
    static  double add(double a, double b,double c,double d) {
        System.out.println("This is overloaded method #3");
        return a+b+c+d;
    }
}
