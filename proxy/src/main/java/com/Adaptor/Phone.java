package com.Adaptor;

public class Phone {
    public void charging(Dest5V dest5V){
        if(dest5V.output5V()==5){
            System.out.println("Charging it!");
        }else{
            System.out.println("Voltage is not right. No charging!");
        }
    }
}
