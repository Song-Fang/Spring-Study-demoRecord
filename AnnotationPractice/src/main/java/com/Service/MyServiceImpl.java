package com.Service;

import com.Dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("myService")
public class MyServiceImpl implements MyService{
    @Autowired
    @Qualifier(value = "myDaoImpl")
    MyDao myDao;

    public MyServiceImpl(){
    }

    public void saveAccount(){
        myDao.saveData();
    }

    @PostConstruct
    public void init(){
        System.out.println("Initialization successful!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean has been destroyed!");
    }

}
