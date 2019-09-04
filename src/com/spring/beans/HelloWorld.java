package com.spring.beans;

public class HelloWorld {
	public String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void hello() {
		System.out.println("Hello "+name);
	}
	
	public HelloWorld() {
		
	}
	
	public HelloWorld(String str) {
		System.out.println("Constructor has parameters.");
	}
	
	
}
