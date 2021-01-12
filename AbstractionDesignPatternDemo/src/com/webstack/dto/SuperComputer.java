package com.webstack.dto;

public class SuperComputer extends Computer {

	private String type;
	private String hdd;
	private String ram;
	private String cpu;
	
	public SuperComputer(String type,String hdd,String ram,String cpu) {
		this.type = type;
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = "Inter Core - "+cpu;
	}
	
	public String getType() {
		return this.type;
	}
	
	@Override
	public String getHD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
