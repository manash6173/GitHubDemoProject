package com.manash.orm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manash.orm.entity.EmployeeEntity;
import com.manash.orm.service.EmployeeService;

public class EmployeeHLOTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		EmployeeService service=null;
		ctx=new ClassPathXmlApplicationContext("com/manash/orm/config/applicationContext.xml");
		service=ctx.getBean("empService",EmployeeService.class);
		//invoke service method
		EmployeeEntity entity=new EmployeeEntity();
		entity.setEmpNo(1001);
		entity.setFName("Manash");
		entity.setLName("Swain");
		entity.setEmail("manash@gmail.com");
		entity.setMobileNo(7008291567l);
		System.out.println(service.saveEmployee(entity));

	}

}
