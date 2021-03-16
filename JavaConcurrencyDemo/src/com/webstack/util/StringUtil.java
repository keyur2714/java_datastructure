package com.webstack.util;

public class StringUtil {

	
	public String revStr(String str) {		
		try {
			System.out.println("Allowed...!"+str);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (str) {
			String revStr = new StringBuffer(str).reverse().toString();
			return revStr;
		}		
		
	}
	
	public static void display(String str) { 
		System.out.println("Display String is : "+str);
	}
	
}
