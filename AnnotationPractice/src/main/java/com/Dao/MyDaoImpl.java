package com.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class MyDaoImpl implements MyDao{

    public void saveData(){
        System.out.println("Data has been saved!");
    }
}
