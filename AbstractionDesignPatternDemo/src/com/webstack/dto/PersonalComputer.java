package com.webstack.dto;

public class PersonalComputer extends Computer {
	
	private String type;
	private String hdd;
	private String ram;
	private String cpu;
	
	public PersonalComputer(String type,String hdd,String ram,String cpu) {
		this.type = type;
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = "Intel Core - "+cpu;
	}
	
	public String getType() {
		return this.type;
	}

	@Override
	public String getHD() {
		return this.hdd;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getCPU() {		
		return this.cpu;
	}

	
}
