package com.webstack.util;

import java.util.function.Function;

public class MapFunction implements Function<String, String> {

	@Override
	public String apply(String str) {
		// TODO Auto-generated method stub
		return str.substring(0,1).toUpperCase();
	}

}
