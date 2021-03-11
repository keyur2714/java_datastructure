package com.webstack.util;

public class TestAnnotationsImpl extends TestAnnotationsClass implements TestAnnotations{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello From TestAnnotsions Interface...!");
	}

	@Override
	public void displayTestFromClass() {
		System.out.println("Hi From TestAnnotationsImpl...");
	}

	
}
