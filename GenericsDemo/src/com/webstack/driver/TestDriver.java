package com.webstack.driver;

import java.util.List;

import com.webstack.dto.EmployeeDTO;
import com.webstack.service.IService;
import com.webstack.service.impl.EmployeeServiceImpl;

public class TestDriver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		EmployeeDTO employee1 = new EmployeeDTO();
		employee1.setEmployeeId(39);
		employee1.setName("ketan");
		
		/*IService employeeService = new EmployeeServiceImpl();
		employeeService.save(employee1);
		
		EmployeeDTO emp = (EmployeeDTO) employeeService.get(32);*/
		IService<EmployeeDTO> employeeService = new EmployeeServiceImpl();
		employeeService.save(employee1);
		
		EmployeeDTO emp = employeeService.get(27);
		
		System.out.println(emp.getEmployeeId() +" "+emp.getName());
		
		List<EmployeeDTO> allEmployees = employeeService.list();
		
		allEmployees.forEach(e->System.out.println(e.getEmployeeId()+" "+e.getName()));
		
		System.out.println("====================");
		
		EmployeeDTO empForUpdate = employeeService.get(12345);
		empForUpdate.setName("keyur");
		
		int result = employeeService.update(empForUpdate);
		if(result > 0) {
			System.out.println("Employee Updated Successfully with id : "+empForUpdate.getEmployeeId());
		}
		
		System.out.println("After Update...");
		
		List<EmployeeDTO> afterUpdateEmployees = employeeService.list();
		
		afterUpdateEmployees.forEach(e->System.out.println(e.getEmployeeId()+" "+e.getName()));
		
		System.out.println("After Delete....");
		
		employeeService.delete(24);
		
		List<EmployeeDTO> afterDeleteEmployees = employeeService.list();
		
		afterDeleteEmployees.forEach(e->System.out.println(e.getEmployeeId()+" "+e.getName()));
		
		
	}

}
