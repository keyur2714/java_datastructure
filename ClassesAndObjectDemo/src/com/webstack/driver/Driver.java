package com.webstack.driver;

import com.webstack.bean.Items;
import com.webstack.util.StringUtil;

public class Driver {
	
	public void sayDone(){
		System.out.println("Done...!");
	}
	
	//Annonymous block called when object is got created.
	{
		System.out.println("when obkect is created...!");
	}
	
	static {
		System.out.println("Always First...!");		
	}
	
	public Driver() {
		System.out.println("From Default Constructor...!");
	}
	
	public static void sayHello() {
		System.out.println("Hello Radhe Krishna...!");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//	System.out.println("Hello Radhe Krishna..!");	
		sayHello(); //Same class static method can be called without class name
		
		Items item1 = new Items(); // default constructor
		item1.setId(1); //instace method
		item1.setBarcode("X0001");
		item1.setName("Vej Puff");
		item1.setDescription("Fresh Vej Puff");
		item1.setUnitPrice(15);
		item1.setQuantity(50);
		
		Items item2 = new Items(2,"X0002","Cream Roll","Fresh Cream Roll",10,40); //parameterized constructor
		
		Items item3 = new Items(3,"X0003","Tea","Ginger Tea",10,100); //parameterized constructor
		
		item1.display();
		item2.display();
		item3.display();
		
		System.out.println("===========With Array===========");
		
		Items items[]=new Items[3]; //Array Declaration
		items[0] = item1;
		items[1] = item2;
		items[2] = item3;
		
		for(Items item: items) {
			item.display();
		}
		
		System.out.println("Static Methods...");
		String str = "keyur";
		//Static method can be called without object
		String revString = StringUtil.revStr(str);
		System.out.println("Reverse String of "+str+" is : "+revString);
		
		int n=100;
		StringUtil s[]=new StringUtil[n];
		
		for(int i=0;i<35;i++) {
			s[i] = new StringUtil();
		}
		System.out.println("Total Object Created : "+StringUtil.cnt);
		
		//System.out.println("Done...!");
		new Driver().sayDone();
		
	}

}
