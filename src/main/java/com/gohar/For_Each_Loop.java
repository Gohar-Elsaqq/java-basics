package com.gohar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class For_Each_Loop {
    //for-each = traversing technique to iterate through the elements in an array or array/collection.
    //lees steps , more readable
    //less flexibility

//    public static void main(String[] args) {
//        String[] names = {"John", "Mary", "Peter" };
//     for (String  i : names){
//        System.out.println(i);
//    }
//    }
//    public static void main(String[] args) {
//    String[] products = {"Laptop", "Smartphone", "Headphones"};
//    String[] categories = {"Electronics", "Electronics", "Electronics"};
//
//    // Or using a Map for better association
//    Map<String, String> productCategories = new HashMap<>();
//    productCategories.put("Laptop", "Electronics");
//    productCategories.put("Smartphone", "Electronics");
//    productCategories.put("Headphones", "Electronics");
//
//    // Printing products and categories
//    for (int i = 0; i < products.length; i++) {
//        System.out.println("Product: " + products[i] + ", Category: " + categories[i]);
//    }
//
//    // Using Map for printing
//    for (Map.Entry<String, String> entry : productCategories.entrySet()) {
//        System.out.println("Product: " + entry.getKey() + ", Category: " + entry.getValue());
//    }
//}
//public static void main(String[] args) {
//    Map<String, Map<String, Double>> productsByCategory = new HashMap<>();
//    Map<String, Double> electronics = new HashMap<>();
//    electronics.put("Laptop", 999.99);
//    // ... add more electronics products
//
//    Map<String, Double> apparel = new HashMap<>();
//    apparel.put("T-shirt", 19.99);
//    // ... add more apparel products
//
//    productsByCategory.put("Electronics", electronics);
//    productsByCategory.put("Apparel", apparel);
//
//    // Access and print products
//    for (Map.Entry<String, Map<String, Double>> categoryEntry : productsByCategory.entrySet()) {
//        String category = categoryEntry.getKey();
//        Map<String, Double> products = categoryEntry.getValue();
//        for (Map.Entry<String, Double> productEntry : products.entrySet()) {
//            String product = productEntry.getKey();
//            double price = productEntry.getValue();
//            System.out.println("Product: " + product + ", Category: " + category + ", Price: $" + price);
//        }
//    }
//}

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");

        for (String i:animals){
            System.out.println(i);
        }
    }

}

