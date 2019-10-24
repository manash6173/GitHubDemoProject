package com.manash.orm.service;

import org.apache.log4j.Logger;

import com.manash.orm.dao.EmployeeDAO;
import com.manash.orm.entity.EmployeeEntity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeServiceImpl implements EmployeeService {
	
	/**
	 * Inject employee Dao class object
	 */
	private EmployeeDAO dao;
	
	/**
	 * Create logger object or initalizing logger object
	 * 
	 */
	private static final Logger logger=Logger.getLogger(EmployeeServiceImpl.class);

	@Override
	public String saveEmployee(EmployeeEntity entity) {
		String msg=null;
		logger.info("***EmployeeServiceImpl saveEmployee(-) method execution started****");
		if(entity!=null) {
			//use dao class
			int count=dao.insertEmployeeDetails(entity);
			return (count!=0)?"Employee Details added Successfully":"falied to add employee details";
		}
		return null;
	}

}
