package com.mySpring.service;

import com.mySpring.domain.Account;

import java.util.List;

public interface MyService {
     List<Account> findAllAccount();
     Account findAccountById(int id);
     void saveAccount(Account account);
     void deleteAccount(int id);
     void updateAccount(Account account);
     void transferMoney(String source,String dest,int money);


}
