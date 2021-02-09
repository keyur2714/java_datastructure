package com.webstack.service;

//import com.webstack.dto.EmployeeDTO;

public interface IService<T> {

	/*void save(Object object);
	Object get(long id);*/
	void save(T object);
	T get(long id);
	
}
