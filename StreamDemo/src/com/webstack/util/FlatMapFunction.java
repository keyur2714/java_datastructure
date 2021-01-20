package com.webstack.util;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapFunction implements Function<Stream<String>, List<String>> {

	@Override
	public List<String> apply(Stream<String> str) {
		// TODO Auto-generated method stub
		
		return str.map(s->s.substring(0,1)).collect(Collectors.toList());
	}

}
