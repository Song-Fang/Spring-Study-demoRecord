package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object teacher){
        this.target = teacher;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new InvocationHandler(){

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Proxy initialization...");
                Object result = method.invoke(target,args);
                return result;
            }
        });
    }
}
