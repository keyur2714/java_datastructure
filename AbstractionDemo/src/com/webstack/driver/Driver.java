package com.webstack.driver;

import com.webstack.bean.Car;
import com.webstack.bean.Vehicle;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		Car car = new Car();
		car.setBrand("Honda");
		car.setName("City IV-tech");
		car.setType("Sedan");
		car.setPrice(100000);
		
		car.setNoOfWheels(4);
		
		car.display();
		
		
	}

}
