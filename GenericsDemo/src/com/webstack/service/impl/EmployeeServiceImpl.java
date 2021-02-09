package com.webstack.service.impl;

import com.webstack.dto.EmployeeDTO;
import com.webstack.service.IService;

public class EmployeeServiceImpl implements IService<EmployeeDTO> {

/*	@Override
	public void save(Object object) {		
		System.out.println("Employee Saved Successfully with Id : "+((EmployeeDTO)object).getEmployeeId());
	}

	@Override
	public Object get(long id) {
		EmployeeDTO employee = new EmployeeDTO();
		employee.setEmployeeId(id);
		employee.setName("denish");
		return employee;
	}*/

	@Override
	public void save(EmployeeDTO object) {		
		System.out.println("Employee Saved Successfully with Id : "+object.getEmployeeId());
	}

	@Override
	public EmployeeDTO get(long id) {
		EmployeeDTO employee = new EmployeeDTO();
		employee.setEmployeeId(id);
		employee.setName("denish");
		return employee;
	}

	

}
