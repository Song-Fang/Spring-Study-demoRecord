package com.view;

import com.factory.BeanFactory;
import com.service.MyAccountService;

public class View {
    public static void main(String [] args){
        MyAccountService myAccountService = (MyAccountService)BeanFactory.getBean("accountService");
        myAccountService.saveMyAccount();
    }
}
