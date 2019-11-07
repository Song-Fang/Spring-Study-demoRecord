package com.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Properties properties;
    private static Map<String, Object> beans;

    static{
        properties = new Properties();
        beans = new HashMap<String, Object>();
        try {
            InputStream is = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(is);
            Enumeration keys = properties.keys();
            while(keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String path = properties.getProperty(key);
                Object value = Class.forName(path).newInstance();

                beans.put(key,value);
            }
        }catch(Exception e) {
            throw new ExceptionInInitializerError("Initialize Failed!");
        }
    }

    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

}
