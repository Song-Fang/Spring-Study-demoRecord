package com.Service;

import com.Dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myService")
public class MyServiceImpl implements MyService{
    @Autowired
    MyDao myDao;

    public MyServiceImpl(){
    }

    public void saveAccount(){
        myDao.saveData();
    }

}
