package com.webstack.util;

import java.lang.reflect.Method;

import com.webstack.custom.MyAnnotations;

public class TestAnnotationsClass {
	@MyAnnotations(name="Vinit",city="Pune")
	public void displayTestFromClass() throws NoSuchMethodException, SecurityException {
		System.out.println("Hello From TEST Annotations Class...!");		
	}
	
	@Deprecated
	public void display() {
		System.out.println("Old Display...!");
	}
}
