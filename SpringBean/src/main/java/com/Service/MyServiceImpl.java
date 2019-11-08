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
}
