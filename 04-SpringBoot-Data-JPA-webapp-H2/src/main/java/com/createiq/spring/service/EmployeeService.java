package com.createiq.spring.service;

import java.util.List;

import com.createiq.spring.entity.Employee;

public interface EmployeeService {
 
	public Employee add(Employee employee);
	
	public Employee update(Employee employee);
	
	
	public List<Employee> findAll();
	
//	public List<Employee> findByName(String ename);
	
	public Employee findById(Integer eid);

	void delete(Integer eid);

	
	
	
}
