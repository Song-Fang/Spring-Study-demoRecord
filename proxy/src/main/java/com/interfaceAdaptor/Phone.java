package com.interfaceAdaptor;

public class Phone {
    public void charging(InterfaceAdaptor interfaceAdaptor){
        if(interfaceAdaptor.m1()==5){
            System.out.println("Begin charging...");
        }else{
            System.out.println("The Voltage you input is not suitable.");
        }
    }
}
