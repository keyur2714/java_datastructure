package com.webstack.dp;

import com.webstack.dto.Computer;
import com.webstack.dto.PersonalComputer;
import com.webstack.dto.SuperComputer;

public class ComputerFactory {
	
	public static Computer getComputer(String type,String hdd,String ram,String cpu) {
		if("PC".equalsIgnoreCase(type)) {
			return new PersonalComputer(type, hdd, ram, cpu);
		}else if("SPC".equalsIgnoreCase(type)) {
			return new SuperComputer(type, hdd, ram, cpu);
		}
		return null;
	}

}
