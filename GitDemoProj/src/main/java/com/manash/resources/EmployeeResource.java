package com.manash.resources;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manash.binding.EmployeeBind;
import com.manash.config.Employee;
import com.manash.service.EmployeeService;

@RestController
public class EmployeeResource {
	@Autowired
	private EmployeeService service;
	
	@GetMapping(value = "/findEmp/{id}",produces = {"application/json","application/xml"})
	public @ResponseBody EmployeeBind searchEmp(@PathVariable String id) {
		System.out.println("kjklshgl");
		Employee emp=null;
		EmployeeBind empBind=null;
		if(service!=null) {
			emp=service.getEmpById(Integer.valueOf(id));
			//copy values from emp to empBind
			empBind=new EmployeeBind();
			BeanUtils.copyProperties(emp,empBind);
			System.out.println(empBind);
		}
		return empBind;
		
	}
		
	}


