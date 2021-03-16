package com.webstack.task;

import java.util.concurrent.Callable;

import com.webstack.util.StringUtil;

public class StringOperation implements Callable<String>{

	private String str;
	
	public StringOperation(String str) {
		this.str = str;
	}
	
	@Override
	public String call() throws Exception {
		StringUtil stringUtil = new StringUtil();		
		String result = stringUtil.revStr(str);
		return "Result is : "+result;
	}

}
