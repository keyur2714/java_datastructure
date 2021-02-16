package com.webstack.service.impl;

import java.util.List;

import com.webstack.dao.IDao;
import com.webstack.dao.impl.EmployeeDAOImpl;
import com.webstack.dto.EmployeeDTO;
import com.webstack.service.IService;

public class EmployeeServiceImpl implements IService<EmployeeDTO> {

	/*
	 * @Override public void save(Object object) {
	 * System.out.println("Employee Saved Successfully with Id : "+((EmployeeDTO)
	 * object).getEmployeeId()); }
	 * 
	 * @Override public Object get(long id) { EmployeeDTO employee = new
	 * EmployeeDTO(); employee.setEmployeeId(id); employee.setName("denish"); return
	 * employee; }
	 */

	@Override
	public void save(EmployeeDTO object) {
		IDao<EmployeeDTO> empDao = new EmployeeDAOImpl();
		empDao.save(object);
		System.out.println("Employee Saved Successfully with Id : " + object.getEmployeeId());
	}

	@Override
	public EmployeeDTO get(int id) {
		IDao<EmployeeDTO> empDao = new EmployeeDAOImpl();
		EmployeeDTO employee = empDao.get(id);
		return employee;
	}

	@Override
	public List<EmployeeDTO> list() {
		IDao<EmployeeDTO> empDao = new EmployeeDAOImpl();
		return empDao.list();
	}

	@Override
	public int update(EmployeeDTO object) {
		IDao<EmployeeDTO> empDao = new EmployeeDAOImpl();
		return empDao.update(object);
	}

	@Override
	public void delete(int id) {
		IDao<EmployeeDTO> empDao = new EmployeeDAOImpl();
		empDao.delete(id);
	}

}
