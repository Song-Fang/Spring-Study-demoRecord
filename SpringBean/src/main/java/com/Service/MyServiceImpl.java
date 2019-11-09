package com.Service;

import com.Dao.MyDao;
import com.Dao.MyDaoImpl;


public class MyServiceImpl implements MyService{

    MyDao myDao = new MyDaoImpl();

    public MyServiceImpl(){
        System.out.println("Object has been created!");
    }

    public void saveAccount(){
        myDao.saveData();
    }

    public void init(){
        System.out.println("Bean has been initialized.");
    }

    public void destroy(){
        System.out.println("Bean has been destroyed.");
    }
}
