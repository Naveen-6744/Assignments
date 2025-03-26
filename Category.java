//6. WAP to group list of products by category without category field
package com.naveen.asignments;

import java.util.*;
import java.util.stream.Collectors;

public class Category {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Apple", "Banana", "TV", "Laptop", "Shirt", "Orange", "Mobile", "Pants");
        Map<String, List<String>> groupedProducts = products.stream()
            .collect(Collectors.groupingBy(Category::getCategory));
        groupedProducts.forEach((category, productList) -> 
            System.out.println(category + ": " + productList));
    }
    public static String getCategory(String product) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Grapes");
        List<String> electronics = Arrays.asList("TV", "Laptop", "Mobile", "Tablet", "Headphones");
        List<String> clothing = Arrays.asList("Shirt", "Pants", "T-shirt", "Jacket");

        if (fruits.contains(product)) return "Fruits";
        else if (electronics.contains(product)) return "Electronics";
        else if (clothing.contains(product)) return "Clothing";
        else return "Other"; // Default category if product is unknown
    }
}

