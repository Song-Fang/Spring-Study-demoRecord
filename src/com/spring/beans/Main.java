package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		HelloWorld h = new HelloWorld();
//		h.setName("Song");
//		h.hello();
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hello = (HelloWorld)ac.getBean("helloWorld");
		hello.hello();
		
	}
}
