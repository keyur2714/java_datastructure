package com.webstack.service;

import java.util.List;

//import com.webstack.dto.EmployeeDTO;

public interface IService<T> {

	/*void save(Object object);
	Object get(long id);*/
	void save(T object);
	T get(int id);
	List<T> list();
	
}
