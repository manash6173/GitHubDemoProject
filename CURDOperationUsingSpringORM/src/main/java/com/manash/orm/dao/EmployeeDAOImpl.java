package com.manash.orm.dao;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.manash.orm.entity.EmployeeEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * This is the implemented class for the EmployeeDAO interface
 * @author manas
 *
 */
@Setter
@Getter
public class EmployeeDAOImpl implements EmployeeDAO {
	
	/**
	 * Injection hibernate Template class object
	 */
	private HibernateTemplate ht;
	/**
	 * Initalizaing  logger object
	 */
	private static final Logger logger=Logger.getLogger(EmployeeDAOImpl.class);
	static {
		logger.info("***EmployeeDAOImpl class is loaded successfully inside the jvm***");
	}
	public EmployeeDAOImpl() {
		logger.info("****EmployeeDAOImpl object created successfully***");
	}
	

	@Override
	public int insertEmployeeDetails(EmployeeEntity entity) {
		logger.debug("***EmployeeDAOImpl insertEmployeeDetails() method execution started***");
		int count=0;
		if(entity!=null) {
			logger.debug("*** Entity object contains value and inoke save(-) method***");
			count=(int)ht.save(entity);
			
		}
		logger.debug("***EmployeeDAOImpl insertEmployeeDetails() method execution completed***");
		return count;
	}

}
