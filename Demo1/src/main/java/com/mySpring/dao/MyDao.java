package com.mySpring.dao;

import com.mySpring.domain.Account;

import java.util.List;

public interface MyDao {
    List<Account> findAllAccount();
    Account findAccountById(int id);
    void saveAccount(Account account);
    void deleteAccount(int id);
    void updateAccount(Account account);
    Account findAccountByName(String name);
}
