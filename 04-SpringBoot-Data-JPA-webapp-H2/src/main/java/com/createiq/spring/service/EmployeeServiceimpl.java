package com.createiq.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.spring.entity.Employee;
import com.createiq.spring.repository.EmployeeRepository;
@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee add(Employee employee) {
		
		 return employeeRepository.save(employee);
	}
    
	@Override
	public List<Employee> findAll() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee update(Employee employee) {
		return employeeRepository.save(employee);
		
	}
	
	@Override
	public void delete(Integer eid) {
	 employeeRepository.deleteById(eid);
		
	}


//	public List<Employee> findByName(String ename) {
//		// TODO Auto-generated method stub
//		return employeeRepository.findByName(ename);
//		
//	}

	@Override
	public Employee findById(Integer eid) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(eid).get();
	}

	
	
}
