package com.service;

import com.dao.DaoAccount;
import com.dao.DaoAccountImpl;

import java.util.Date;

public class ServiceAccountImpl implements ServiceAccount {
    String name;
    int age;
    Date dateBirth;

    DaoAccount daoAccount = new DaoAccountImpl();

    public ServiceAccountImpl(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.dateBirth = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void saveAccount() {
        daoAccount.saveData();
        System.out.println(name+","+age+","+dateBirth);
    }
}
