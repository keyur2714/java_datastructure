package com.webstack.action;

import com.webstack.util.NumberThread;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new NumberThread();
		t1.setName("T1");
		t1.start();
		Thread t2 = new NumberThread();
		t2.setName("T2");
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t3 = new NumberThread();
		t3.setName("T3");
		t3.start();
	}

}
