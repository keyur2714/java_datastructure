package com.webstack.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		List<Integer> rollNumbersList = Arrays.asList(11,44,2,6,22,77,88); 
		
		rollNumbersList.stream().forEach(no->System.out.println(no));
		
		System.out.println("After Sorting");
		
		Collections.sort(rollNumbersList);
		
		rollNumbersList.stream().forEach(no->System.out.println(no));
		
		Customer customer1 = new Customer(11,"keyur","keyurjava27@gmail.com","7387029671","surat");
		
		Customer customer2 = new Customer(12,"denish","denishhava@@gmail.com","7387029771","mumbai");
		
		Customer customer3 = new Customer(13,"vinit","vinit.biz@gmail.com","7387029871","bardoli");
		
		List<Customer> customerList = new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		
		System.out.println("Before Sorting");
		
		customerList.stream().forEach(System.out::println);
		
		Collections.sort(customerList);
		
		System.out.println("After Sorting");
		
		customerList.stream().forEach(System.out::println);
		
		System.out.println("Sorting on Customer Name Desc Order: ");
		
		CustomerComparator customerComparator = new CustomerComparator();
		customerComparator.setSortFieldName("customerName");
		customerComparator.setSortOrder("desc");
		
		Collections.sort(customerList, customerComparator);
		
		customerList.stream().forEach(System.out::println);
		
		System.out.println("Sorting on CustomerId on Desc Order: ");
		
		CustomerComparator customerComparator1 = new CustomerComparator();
		customerComparator1.setSortFieldName("customerId");
		customerComparator1.setSortOrder("desc");
		
		Collections.sort(customerList, customerComparator1);
		
		customerList.stream().forEach(System.out::println);
		
	}

}
