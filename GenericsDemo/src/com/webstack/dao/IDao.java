package com.webstack.dao;

import java.util.List;

public interface IDao<T> {
	void save(T object);
	T get(int id);
	List<T> list();
}
