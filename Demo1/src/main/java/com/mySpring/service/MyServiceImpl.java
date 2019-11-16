package com.mySpring.service;

import com.mySpring.dao.MyDao;
import com.mySpring.domain.Account;

import java.util.List;

public class MyServiceImpl implements MyService {
    private MyDao myDao;

    public void setMyDao(MyDao myDao) {
        this.myDao = myDao;
    }

    public List<Account> findAllAccount() {
        return myDao.findAllAccount();
    }

    public Account findAccountById(int id) {
        return myDao.findAccountById(id);
    }

    public void saveAccount(Account account) {
        myDao.saveAccount(account);
    }

    public void deleteAccount(int id) {
        myDao.deleteAccount(id);
    }

    public void updateAccount(Account account) {
        myDao.updateAccount(account);
    }
}
