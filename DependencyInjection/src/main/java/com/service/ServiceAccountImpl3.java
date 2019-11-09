package com.service;

import com.dao.DaoAccount;
import com.dao.DaoAccountImpl;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ServiceAccountImpl3 implements ServiceAccount {
    String [] arrays;
    List<String> myList;
    Map<String,String> myMap;
    Properties myProperties;

    DaoAccount daoAccount = new DaoAccountImpl();

    public void setArrays(String [] arrrays){
        this.arrays = arrays;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProperties(Properties myProperties) {
        this.myProperties = myProperties;
    }

    public void saveAccount() {
        daoAccount.saveData();
        System.out.println(Arrays.toString(arrays));
        System.out.println(myList);
        System.out.println(myMap);
        System.out.println(myProperties);
    }
}
