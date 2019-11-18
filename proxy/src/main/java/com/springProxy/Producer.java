package com.springProxy;

public class Producer implements MyProducer{

    public void sellProduct(int money){
        System.out.println("Sell product and get money: "+money);
    }

    public void productService(int money){
        System.out.println("Serve customers and get money: "+money);
    }
}
