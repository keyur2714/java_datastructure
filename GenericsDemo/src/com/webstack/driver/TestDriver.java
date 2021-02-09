package com.webstack.driver;

import com.webstack.dto.EmployeeDTO;
import com.webstack.service.IService;
import com.webstack.service.impl.EmployeeServiceImpl;

public class TestDriver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		EmployeeDTO employee1 = new EmployeeDTO();
		employee1.setEmployeeId(12345l);
		employee1.setName("keyur");
		
		/*IService employeeService = new EmployeeServiceImpl();
		employeeService.save(employee1);
		
		EmployeeDTO emp = (EmployeeDTO) employeeService.get(32);*/
		IService<EmployeeDTO> employeeService = new EmployeeServiceImpl();
		employeeService.save(employee1);
		
		EmployeeDTO emp = employeeService.get(32);
		
		System.out.println(emp.getEmployeeId() +" "+emp.getName());
	}

}
