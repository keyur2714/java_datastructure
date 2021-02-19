package com.webstack.util;

public class EmployeeTask implements Runnable{

	private int i;
	public EmployeeTask(int i) {
		this.i = i;
	}
	
	@Override
	public void run() {
		System.out.println("Thread : "+this.i);		
	}

}
