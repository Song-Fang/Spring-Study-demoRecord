package com.interfaceAdaptor;

public class Client {
    public static void main(String[] args) {
        AbsAdaptor absAdaptor = new AbsAdaptor() {
            @Override
            public int m1() {
                return 5;
            }
        };

        Phone myPhone = new Phone();
        //Polymorphism
        myPhone.charging(absAdaptor);
    }
}
