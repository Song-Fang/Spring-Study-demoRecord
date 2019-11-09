package com.view;

import com.service.ServiceAccount;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ServiceAccount serviceAccount = ac.getBean("serviceAccount3",ServiceAccount.class);
        serviceAccount.saveAccount();

    }
}
