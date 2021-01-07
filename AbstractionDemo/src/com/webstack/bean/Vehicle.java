package com.webstack.bean;

public class Vehicle {

	private String name;
	private String type;
	private String brand;
	private long price;

	public Vehicle() {
		System.out.println("Vehicle Object Created...!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(long price) {
		this.price = price;	
	}
	
	public long getPrice() {
		return price;
	}
	
	//same signature in child
	public void display() {
		System.out.print(this.brand+" "+this.name+" "+this.type+" ");
	}
	
}
