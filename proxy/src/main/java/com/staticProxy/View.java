package com.staticProxy;

public class View {
    public static void main(String[] args) {
        Iteacher teacherDao = new TeacherDao();
        Iteacher teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
