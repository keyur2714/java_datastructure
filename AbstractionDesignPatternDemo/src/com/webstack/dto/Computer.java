package com.webstack.dto;

public abstract class Computer {	

	public abstract String getHD();

	public abstract String getRAM();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "HD = "+this.getHD()+" RAM = "+this.getRAM()+" CPU = "+this.getCPU();
	}

}
