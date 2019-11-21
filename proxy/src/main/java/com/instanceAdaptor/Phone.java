package com.instanceAdaptor;

public class Phone {
    public void charging(Out5V out5V){
        if(out5V.outputVoltage()==5){
            System.out.println("Charging...");
        }else{
            System.out.println("The voltage is not correct, beware your phone!");
        }
    }
}
