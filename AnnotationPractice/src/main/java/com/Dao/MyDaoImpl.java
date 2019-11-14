package com.Dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class MyDaoImpl implements MyDao{
    @Value("#{'Francis'}")
    String name;

    @Value("#{3}")
    int id;

    public void saveData(){

        System.out.println("Data has been saved!");
        System.out.println(name);
        System.out.println(id);
    }
}
