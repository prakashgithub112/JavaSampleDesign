package com.cg.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterData {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();
        
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000));  
        productsList.add(new Product(2,"Dell Laptop",30000));  
        productsList.add(new Product(3,"Lenevo Laptop",28000));  
        productsList.add(new Product(4,"Sony Laptop",28000));  
        productsList.add(new Product(5,"Apple Laptop",90000));  
        List productPriceList2 = productsList.stream().filter(p -> p.price > 30000).map(p->p.price).collect(Collectors.toList());
        System.out.println(productPriceList2);
        
        //finding value greateer than any 30
        List<Integer> productsList3 = new ArrayList<Integer>();
        productsList3.add(new Integer(1));
        productsList3.add(new Integer(3));
        productsList3.add(new Integer(50));
        List productPriceList4 = productsList3.stream().filter(p1 -> p1 > 30).collect(Collectors.toList());
        System.out.println(productPriceList4);
        
        //Max number in the list
        Product productA = productsList.stream()  
                .max((product1, product2)->   
                product1.price > product2.price ? 1: -1).get();  
         
        System.out.println(productA.name);
        // min() method to get min Product price  
        Product productB = productsList.stream()  
                .max((product1, product2)->   
                product1.price < product2.price ? 1: -1).get();  
        System.out.println(productB.price);  
    }  
}
 
