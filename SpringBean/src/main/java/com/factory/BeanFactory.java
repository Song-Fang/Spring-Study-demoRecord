package com.factory;

import com.Service.MyService;
import com.Service.MyServiceImpl;

public class BeanFactory {
    public MyService createInstance(){
        return new MyServiceImpl();
    }
}
