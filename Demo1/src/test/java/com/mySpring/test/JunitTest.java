package com.mySpring.test;


import com.mySpring.domain.Account;
import com.mySpring.service.MyService;
import com.mySpring.service.MyServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JunitTest {

    @Test
    public void findAllAccount(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        MyService myService = ac.getBean("myService", MyServiceImpl.class);
        List<Account> lists = myService.findAllAccount();
        for(Account account:lists){
            System.out.println(account);
        }
    }

    @Test
    public void findById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        MyService myService = ac.getBean("myService", MyServiceImpl.class);
        Account account = myService.findAccountById(4);
        System.out.println(account);
    }


    @Test
    public void saveData(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        MyService myService = ac.getBean("myService", MyServiceImpl.class);
        Account account = new Account();
        account.setName("dddd");
        account.setMoney(2000);
        myService.saveAccount(account);
    }


    @Test
    public void deleteData(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        MyService myService = ac.getBean("myService", MyServiceImpl.class);
        myService.deleteAccount(7);
    }


    @Test
    public void updateRecord(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        MyService myService = ac.getBean("myService", MyServiceImpl.class);
        Account account = new Account();
        account.setId(4);
        account.setName("ffff");
        account.setMoney(8000);
        myService.updateAccount(account);
    }

    @Test
    public void transferMoney(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        MyService myService = ac.getBean("myService", MyServiceImpl.class);
        myService.transferMoney("bbb","ccc",100);
    }
}