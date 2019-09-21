package com.spring.beans;

public class Car {
	String brand;
	String cop;
	int price;
	double maxSpeed;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCop() {
		return cop;
	}
	public void setCop(String cop) {
		this.cop = cop;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", cop=" + cop + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(String brand, String cop, int price, double maxSpeed) {
		super();
		this.brand = brand;
		this.cop = cop;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}
	
	
	public Car(String brand, String cop, double maxSpeed) {
		super();
		this.brand = brand;
		this.cop = cop;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String brand, String cop, int price) {
		super();
		this.brand = brand;
		this.cop = cop;
		this.price = price;
	}
	
	
	
}
