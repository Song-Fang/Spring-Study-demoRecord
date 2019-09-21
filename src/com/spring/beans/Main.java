package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		HelloWorld h = new HelloWorld();
//		h.setName("Song");
//		h.hello();
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloWorld hello = (HelloWorld)ac.getBean(HelloWorld.class);
//		hello.hello();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person)ac.getBean("person");
		System.out.println(p);
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Person p = (Person)ac.getBean("person2");
//		System.out.println(p);
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Car c = (Car)ac.getBean("car2");
//		System.out.println(c);
		
		
	}
}
