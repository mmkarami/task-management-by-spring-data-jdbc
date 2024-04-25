package com.mmkarami.task.management.repository;

import java.util.List;

public interface Dao<T> {

	T findById(Integer id);
	
	List<T> findAll();
	
	void save(T t);
	
	void deleteById(Integer id);
	
}