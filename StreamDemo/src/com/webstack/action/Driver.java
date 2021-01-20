package com.webstack.action;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.webstack.util.FlatMapFunction;
import com.webstack.util.MapFunction;
import com.webstack.util.NameFilter;

public class Driver {

	public static void main(String str[]) {
		System.out.println("Hello Radhe Krishna...!");
		
		
		List<String> friendsList = new ArrayList<>();
		
		friendsList.add("keyur");
		friendsList.add("denish");
		friendsList.add("vinit");
		friendsList.add("hiren");
		friendsList.add("ravi");
		friendsList.add("sandip");
		friendsList.add("dharmesh");
		
		//With ForEach Loop
		for(String name : friendsList) {
			System.out.println(name);
		}
		
		System.out.println("======================");
		
		//With Java8 ForEach
		friendsList.stream().forEach(name->System.out.println(name));
		
		System.out.println("======================");
		//one way
		friendsList.stream().filter(name->!name.equals("ravi")).forEach(fName->System.out.println(fName));
		
		System.out.println("========================");
		//another way
		friendsList.stream().filter(new NameFilter()).forEach(fName->System.out.println(fName));
		
		System.out.println("========================");
		List<String> filteredList = friendsList.stream().filter(new NameFilter()).collect(Collectors.toList());
		
		filteredList.forEach(f->System.out.println(f));
		System.out.println("========================");
		
		filteredList.stream().map(s->s.toUpperCase()).forEach(name->System.out.println(name));
		
		System.out.println("========================");
		filteredList.stream().map(new MapFunction()).forEach(name->System.out.println(name));
		
	
	}
	
}
