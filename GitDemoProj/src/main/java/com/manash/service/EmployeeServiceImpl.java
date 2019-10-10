package com.manash.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manash.config.Employee;
import com.manash.repository.EmployeeRepositery;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepositery empRepo;

	@Override
	public Employee getEmpById(int id) {
		Optional<Employee> emp=null;
		if(empRepo!=null)
		   emp=empRepo.findById(id);
		System.out.println(emp);
		return emp.get();
	}

}
