package com.webstack.bean;

public class Items {
	
	//instance variable
	private long id;
	private String barcode;
	private String name;
	private String description;
	private double unitPrice;
	private long quantity;

	public Items() {
	}

	public Items(long id, String barcode, String name, String description, double unitPrice, long quantity) {
		this.id = id;
		this.barcode = barcode;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public void display() {
		System.out.println(this.id+" "+this.barcode+" "+this.name+" "+this.description+" "+this.unitPrice+" "+this.quantity);
	}
	
	
}
