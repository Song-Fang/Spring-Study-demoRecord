package com.instanceAdaptor;

public class Client {
    public static void main(String [] args){
        Phone phone = new Phone();
        phone.charging(new VoltageAdaptor(new Source220V()));
    }
}
