package com.gohar;

import java.util.ArrayList;

public class ArrayList2D {
    //2D arrayList  a=dynamic list of lists
    //you can change the size of these lists during runtime
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> grocery =new ArrayList();

    ArrayList<String> bakery =new ArrayList();
    bakery.add("pasta");
    bakery.add("garlic bread");
    bakery.add("donuts");

        ArrayList<String> products =new ArrayList();
        products.add("tomato");
        products.add("zucchini");
        products.add("peppers");

        ArrayList<String> drank =new ArrayList();
        drank.add("soda ");
        drank.add("coffee");

        grocery.add(bakery);
        grocery.add(products);
        grocery.add(drank);
        System.out.println(grocery.get(0));
        System.out.println(grocery.get(0).get(2));
        System.out.println("removed array index 1 "+grocery.remove(1));

}
}
