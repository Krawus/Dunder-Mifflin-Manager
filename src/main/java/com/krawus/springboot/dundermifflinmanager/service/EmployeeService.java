package com.krawus.springboot.dundermifflinmanager.service;

import java.util.List;

import com.krawus.springboot.dundermifflinmanager.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
