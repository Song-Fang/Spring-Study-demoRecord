package com.Adaptor;

public class VoltageAdaptor extends Source220V implements Dest5V {
    public int output5V() {
        int srcV = output220V();
        int destV = srcV/44;
        return destV;
    }
}
