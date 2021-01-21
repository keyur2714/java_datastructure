package com.webstack.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.webstack.util.FlatMapFunction;
import com.webstack.util.MapFunction;
import com.webstack.util.NameFilter;
import com.webstack.util.Student;

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
		
		
		//Reduce --
		
		List<String> strList = Arrays.asList("banana","apple","p-orange","mango");
				
		//banana-apple-mango - single string
		
		Optional<String> combileString=strList.stream().reduce((s1,s2) -> s1 +"-"+ s2);
		System.out.println(combileString.get());
		
		
		Optional<String> longestString=strList.stream().reduce((s1,s2) -> s1.length() > s2.length() ? s1 : s2);
		
		if(longestString.isPresent())
			System.out.println(longestString.get());
	
		List<Integer> numbers = Arrays.asList(-2,11,33,44,55);
		
		Optional<Integer> sum = numbers.stream().reduce((n1,n2) -> n1+n2);
		
		System.out.println(sum.get());
		
		//Flat Map 
		
		System.out.println("================");
		
		List<Student> studentList = new ArrayList();
		
		Student s1 = new Student("32","keyur",Arrays.asList("7387029671","8600712124"));
		Student s2 = new Student("26","denish",Arrays.asList("8822029671","9900712124"));
		Student s3 = new Student("44","vinit",Arrays.asList("9933029671","7700712124"));
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		System.out.println("=======================");
		
		List<String> names = studentList.stream().map(student->student.getName()).collect(Collectors.toList());
		
		names.forEach(name->System.out.println(name));
		
		System.out.println("=======================");
		
		List<List<String>> mobileNumbers = studentList.stream()
				.map(student->student.getPhoneNumbers())				
				.collect(Collectors.toList());
		
		List<String> allMobileNumbers = mobileNumbers.stream().flatMap(mobileList -> mobileList.stream()).collect(Collectors.toList());
		
		allMobileNumbers.forEach(m->System.out.println(m));
		
		
		
		
		
		
		
	}
	
}
