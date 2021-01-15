package com.webstack.action;

import com.webstack.bean.NewInterfaceFeature;
import com.webstack.bean.TestInterface;
import com.webstack.bean.TestInterfaceImpl;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		
		TestInterface testInterface = new TestInterface() {
			
			@Override
			public void display() {
				System.out.println("Hello Good Morning...!");
				
			}
		};
		
		testInterface.display();
		
		TestInterface testImpl = new TestInterfaceImpl();
		testImpl.display();
		
		//JAVA 8
		
		System.out.println("Java 8 Funtional Interface...");
		
		TestInterface testJava8 = ()-> {
				System.out.println("Hello Good Morning with {}...!");				
		};
		
		TestInterface testJava = ()-> System.out.println("Hello Good Morning witout {}...!");				
			
		testJava8.display();
		testJava8.sayJsk();
		testJava8.sayHi();
		testJava.display();
		testJava.sayJsk();
		testJava.sayHi();
		TestInterface.sayBye();
		
		NewInterfaceFeature newF = new NewInterfaceFeature() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Hell From Java 8...!");
			}
		};
		
		newF.display();
		newF.sayHello();
		newF.sayHi();
		NewInterfaceFeature.sayBye();
	}

}
