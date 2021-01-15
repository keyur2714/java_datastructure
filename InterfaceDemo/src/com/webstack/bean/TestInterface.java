package com.webstack.bean;

@FunctionalInterface
public interface TestInterface {
	int k=27;
	void display();		
	default void sayJsk() {		
		System.out.println("Hello Radhe Krishna...!"+k);
	}
	default void sayHi() {
		System.out.println("Hi From Java8 Lamda...");
	}
	static void sayBye() {
		System.out.println("Good Bye From Static....");
	}
}
