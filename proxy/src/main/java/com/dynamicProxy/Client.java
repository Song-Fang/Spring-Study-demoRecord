package com.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        Iteacher proxyInstance =(Iteacher) new ProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.teach();
    }
}
