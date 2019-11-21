package com.Test;

public class Product implements Comparable{
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    public int compareTo(Object o) {
        if(o instanceof Product){
            /*if(this.price<((Product) o).price){
                return -1;
            }else if(this.price>((Product) o).price){
                return 1;
            }else{
                return this.name.compareTo(((Product) o).name);
            }*/
            return Double.compare(this.price,((Product) o).price);
        }

        throw new RuntimeException("The type you input is not right!");

    }
}
