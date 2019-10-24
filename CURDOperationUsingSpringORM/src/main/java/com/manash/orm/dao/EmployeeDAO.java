package com.manash.orm.dao;

import com.manash.orm.entity.EmployeeEntity;

/**
 * EmployeeDAO interface contains some common specific methods for performing different operation on the database
 * @author manash
 *
 */
public interface EmployeeDAO {

	public int insertEmployeeDetails(EmployeeEntity entity);
	
}
