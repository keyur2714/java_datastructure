package com.webstack.bean;

public class Car extends Vehicle {
	
	private int noOfWheels;
	
	public Car() {
		super(); // must be first statement.
		System.out.println("Car Vehicle object Created...!");		
	}
	
	@Override
	public long getPrice() {
		return super.getPrice() + 5000;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	@Override
	public void display() {
		super.display(); // it used to access parent variable / methods
						// always it must be first statement in case of constructor.	
		System.out.println(this.noOfWheels+" "+this.getPrice());
		//super.display(); -- this is valid in method
	}
	
	
}
