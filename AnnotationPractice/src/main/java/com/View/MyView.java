package com.View;

import com.Service.MyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyView {
    public static void main(String [] args){
        /*
        ClassPathXmlApplicationContext
        FileSystemXmlApplicationContext
        AnnotationConfigApplicationContext
         */
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //MyService myService = (MyService) ac.getBean("myService");
        MyService myService = ac.getBean("myService",MyService.class);
//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        MyService myService = beanFactory.getBean("myService",MyService.class);
        System.out.println(myService);
        myService.saveAccount();
        ac.close();

    }
}
