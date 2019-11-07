package com.service;

import com.Dao.MyAccountDao;
import com.factory.BeanFactory;

public class MyAccountServiceImpl implements MyAccountService{
    public void saveMyAccount() {
        MyAccountDao myAccountDao = (MyAccountDao) BeanFactory.getBean("accountDao");
        myAccountDao.saveAccount();
    }
}
