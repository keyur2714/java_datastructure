package com.webstack.driver;

import java.lang.reflect.Method;

import com.webstack.custom.MyAnnotations;
import com.webstack.util.TestAnnotations;
import com.webstack.util.TestAnnotationsClass;
import com.webstack.util.TestAnnotationsImpl;

public class TestDriver {
	@SuppressWarnings("deprecation")
	public static void main(String str[]) throws NoSuchMethodException, SecurityException {
		System.out.println("Hello Radhe Krishna...!");
		
		TestAnnotations testAnnotations = new TestAnnotationsImpl();
		testAnnotations.display();
		
		
		TestAnnotationsClass tc = new TestAnnotationsImpl();
		tc.displayTestFromClass();
		
		TestAnnotationsClass tc1 = new TestAnnotationsClass();
		
		Method m= tc1.getClass().getMethod("displayTestFromClass");  
		MyAnnotations manno=m.getAnnotation(MyAnnotations.class);  
		System.out.println("Name is: "+manno.name());  
		System.out.println("City is: "+manno.city());
		
		tc1.display();
		tc1.displayTestFromClass();
		
		TestAnnotations tl = ()->{System.out.println("Hello From Lamda...!");};
		tl.display();
	}
}
