package com.webstack.util;

public class StringUtil {
	
	//shared variable
	public static Integer cnt = 0;
	
	public StringUtil() {
		cnt++;
	}

	//shared method accros all objects
	public static String revStr(String str) {		
		return new StringBuffer(str).reverse().toString();
	}
	
}
