package com.mySpring.service;

import com.mySpring.dao.MyDao;
import com.mySpring.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("myService")
public class MyServiceImpl implements MyService {
    @Autowired
    private MyDao myDao;

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
