package com.mySpring.dao;

import com.mySpring.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyDaoImpl implements MyDao{

    @Autowired
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
        try{
            queryRunner.update("delete from account where id=?",id);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public void updateAccount(Account account) {
        try{
            queryRunner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public Account findAccountByName(String name) {
        try{
            List<Account> accounts = queryRunner.query("select * from account where name=?",new BeanListHandler<Account>(Account.class),name);
            if(accounts==null||accounts.size()==0){
                return null;
            }
            if(accounts.size()>1){
                throw new RuntimeException("There are more than one accounts!");
            }
            return accounts.get(0);

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
