package com.webstack.action;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

	private String sortFieldName;
	private String sortOrder;

	public String getSortFieldName() {
		return sortFieldName;
	}

	public void setSortFieldName(String sortFieldName) {
		this.sortFieldName = sortFieldName;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Override
	public int compare(Customer customer1, Customer customer2) {
		// TODO Auto-generated method stub
		if(this.sortOrder.equalsIgnoreCase("asc")) {
			if(this.sortFieldName.equalsIgnoreCase("customerName"))
				return customer1.getCustomerName().compareTo(customer2.getCustomerName());
			if(this.sortFieldName.equalsIgnoreCase("customerId"))
				return customer1.getCustomerId().compareTo(customer2.getCustomerId());
			if(this.sortFieldName.equalsIgnoreCase("email"))
				return customer1.getEmail().compareTo(customer2.getEmail());
			if(this.sortFieldName.equalsIgnoreCase("mobileNo"))
				return customer1.getMobileNo().compareTo(customer2.getMobileNo());
			if(this.sortFieldName.equalsIgnoreCase("city"))
				return customer1.getCity().compareTo(customer2.getCity());
		}else if(this.sortOrder.equalsIgnoreCase("desc")) {
			if(this.sortFieldName.equalsIgnoreCase("customerName"))
				return customer2.getCustomerName().compareTo(customer1.getCustomerName());
			if(this.sortFieldName.equalsIgnoreCase("customerId"))
				return customer2.getCustomerId().compareTo(customer1.getCustomerId());
			if(this.sortFieldName.equalsIgnoreCase("email"))
				return customer2.getEmail().compareTo(customer1.getEmail());
			if(this.sortFieldName.equalsIgnoreCase("mobileNo"))
				return customer2.getMobileNo().compareTo(customer1.getMobileNo());
			if(this.sortFieldName.equalsIgnoreCase("city"))
				return customer2.getCity().compareTo(customer1.getCity());
		}
		return 0;
	}

}
