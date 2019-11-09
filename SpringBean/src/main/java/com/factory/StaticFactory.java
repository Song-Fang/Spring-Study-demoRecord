package com.factory;

import com.Service.MyService;
import com.Service.MyServiceImpl;

public class StaticFactory {

    public static MyService createInstance(){
        return new MyServiceImpl();
    }
}
