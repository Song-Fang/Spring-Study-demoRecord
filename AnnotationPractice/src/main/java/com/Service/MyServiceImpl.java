package com.Service;

import com.Dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("myService")
public class MyServiceImpl implements MyService{
    @Autowired
    @Qualifier(value = "myDaoImpl")
    MyDao myDao;

    public MyServiceImpl(){
    }

    public void saveAccount(){
        myDao.saveData();
    }

}
