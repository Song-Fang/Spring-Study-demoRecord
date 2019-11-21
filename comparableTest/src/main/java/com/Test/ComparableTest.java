package com.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {
    public static void main(String[] args) {
        Product [] products = new Product[5];
        products[0] = new Product("laptop",2000);
        products[1] = new Product("iphone",4500);
        products[2] = new Product("fan",20);
        products[3] = new Product("router",200);
        products[4] = new Product("monitor",150);
        Arrays.sort(products,new Comparator(){
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product&&o2 instanceof Product){
                    if(((Product) o1).price<((Product) o2).price){
                        return 1;
                    }else if (((Product) o1).price>((Product) o2).price){
                        return -1;
                    }else{
                        return ((Product)o1).name.compareTo(((Product)o2).name);
                    }
                }
                throw new RuntimeException("The type of input is not right!");
            }
        });
        System.out.println(Arrays.toString(products));
    }
}
