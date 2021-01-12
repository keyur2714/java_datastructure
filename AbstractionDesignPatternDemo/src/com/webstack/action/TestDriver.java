package com.webstack.action;

import com.webstack.dp.ComputerFactory;
import com.webstack.dto.Computer;
import com.webstack.dto.PersonalComputer;
import com.webstack.dto.SuperComputer;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		//Runtime polymorphism
		//Computer personalComputer=new PersonalComputer("PC","500 GB","8 GB","I3");
		//System.out.println("Personal Computer is : " +personalComputer.toString());
		
		//Computer superComputer = new SuperComputer("SPC", "1 TB", "32 GB", "I11");		
		//System.out.println("Super Computer is : " + superComputer);
		
		Computer pc = ComputerFactory.getComputer("PC","500 GB","8 GB","I3");
		System.out.println("Personal Computer is : " +pc.toString());
		
		Computer spc = ComputerFactory.getComputer("SPC", "1 TB", "32 GB", "I11");
		System.out.println("Super Computer is : "+spc);
		
		
		
		
	}

}
