package com.Adaptor;

public class Client {
    public static void main(String[] args) {
        System.out.println("------Adaptor pattern------");
        Phone myPhone = new Phone();
        myPhone.charging(new VoltageAdaptor());
    }
}
