package com.webstack.util;

import java.util.function.Predicate;

public class NameFilter implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return !t.equals("hiren");
	}

}
