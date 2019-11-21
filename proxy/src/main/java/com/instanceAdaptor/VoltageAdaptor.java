package com.instanceAdaptor;

public class VoltageAdaptor implements Out5V{
    private Source220V source220V;

    public VoltageAdaptor(Source220V source220V){
        this.source220V = source220V;
    }


    public int outputVoltage() {
        int destOutput = 0;
        if(source220V!=null){
            destOutput = source220V.outputVoltage()/44;
        }
        return destOutput;
    }
}
