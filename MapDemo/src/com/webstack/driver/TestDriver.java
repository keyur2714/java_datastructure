package com.webstack.driver;

import java.util.HashMap;
import java.util.Map;

import com.webstack.dto.StudentDTO;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map = new HashMap<>(32);
		
		map.put("A", "123");
		map.put("B", "222");
		map.put("r", "333");
		
		System.out.println(map.get("A"));
		
		Map<StudentDTO,String> studentsMap = new HashMap<>();
		
		StudentDTO student1 = new StudentDTO();
		student1.setRollNo(32);
		student1.setName("keyur");
		
		StudentDTO student2 = new StudentDTO();
		student2.setRollNo(26);
		student2.setName("denish");
		
		StudentDTO student3 = new StudentDTO();
		student3.setRollNo(44);
		student3.setName("vinit");
		
		StudentDTO student4 = new StudentDTO();
		student3.setRollNo(54);
		student3.setName("vinit");
		
		
		studentsMap.put(student1, "surat");
		
		studentsMap.put(student2, "mumbai");
		
		studentsMap.put(student3, "pune");
		
		studentsMap.put(student4, "surat");
		
		System.out.println(studentsMap.get(new StudentDTO(32,"keyur")));
		
		

	}

}
