package com.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class MyDaoImpl2 implements MyDao{

    public void saveData(){
        System.out.println("Data has been saved!");
    }
}