package com.View;

import com.Service.MyService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyView {
    public static void main(String [] args){
        /*
        ClassPathXmlApplicationContext
        FileSystemXmlApplicationContext
        AnnotationConfigApplicationContext
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //MyService myService = (MyService) ac.getBean("myService");
        MyService myService = ac.getBean("myService",MyService.class);
//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        MyService myService = beanFactory.getBean("myService",MyService.class);
        myService.saveAccount();
    }
}
