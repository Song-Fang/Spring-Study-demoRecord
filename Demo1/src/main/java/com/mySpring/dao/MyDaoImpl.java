package com.mySpring.dao;

import com.mySpring.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class MyDaoImpl implements MyDao{
    QueryRunner queryRunner;

    public List<Account> findAllAccount() {
        try{
            return queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public Account findAccountById(int id) {

        try{
            return queryRunner.query("select * from account where id = ?",new BeanHandler<Account>(Account.class),id);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void saveAccount(Account account) {
        try{
            queryRunner.update("insert into account(name,money) values(?,?)",account.getName(),account.getMoney());
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void deleteAccount(int id) {

    }

    public void updateAccount(Account account) {
        try{
            queryRunner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
