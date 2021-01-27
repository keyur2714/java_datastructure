package com.webstack.action;

public class Customer implements Comparable<Customer> {

	private Integer customerId;
	private String customerName;
	private String email;
	private String mobileNo;
	private String city;
	
	
	public Customer(Integer customerId, String customerName, String email, String mobileNo, String city) {		
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.city = city;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int compareTo(Customer o) {		
		return this.email.compareTo(o.email);
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", city=" + city + "]";
	}
	
	
	
	
}
