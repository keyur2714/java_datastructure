package com.webstack.bean;

public interface NewInterfaceFeature {

	void display();
	
	default void sayHello() {
		System.out.println("Hello From Default Method...");
	}
	
	default void sayHi() {
		System.out.println("Hi From Java8...");
	}
	
	static void sayBye() {
		System.out.println("Good Bye...!");
	}
	
}
