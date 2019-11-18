package com.staticProxy;

public class TeacherDaoProxy implements Iteacher {
    private Iteacher teacherDao;

    public TeacherDaoProxy(Iteacher iteacher){
        this.teacherDao = iteacher;
    }


    public void teach() {
        System.out.println("Initialzie proxy...");
        teacherDao.teach();
        System.out.println("Proxy ended!");
    }
}
