package com.Service;

import com.Dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("myService")
@Scope("prototype")
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
