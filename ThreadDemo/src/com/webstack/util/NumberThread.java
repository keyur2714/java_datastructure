package com.webstack.util;

public class NumberThread extends Thread {

	public void run() {
		if(this.getName().equalsIgnoreCase("T1")) {
			System.out.println("Hello From Number Thread T1...!");
			for(int i=1;i<=5;i++) {
				System.out.println("T1: "+i);
				try {
					this.sleep(1000l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		else if(this.getName().equalsIgnoreCase("T2")) {
			System.out.println("Hello From Number Thread T2...!");
			for(int i=1;i<=5;i++) {
				System.out.println("T2: "+i);
				try {
					this.sleep(500l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
		else if(this.getName().equalsIgnoreCase("T3")) {
			System.out.println("Hello From Number Thread T3...!");
			for(int i=1;i<=5;i++) {
				System.out.println("T3: "+i);
				try {
					this.sleep(100l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}
	
}
