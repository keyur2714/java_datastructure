package com.webstack.util;

import java.util.List;

public class Student {

	private String rollNo;
	private String name;
	private List<String> phoneNumbers;

	public Student(String rollNo, String name, List<String> phoneNumbers) {
		this.rollNo = rollNo;
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

}
