package com.manash.orm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.Data;

/**
 * This is the domain class that maps the class properties with the database
 * table
 * 
 * @author manas
 *
 */
@Entity
@Table(name = "EMPLOYEE_TABLE")
@Data
public class EmployeeEntity implements Serializable {

	@Id
	@GenericGenerator(name = "empGen", strategy = "increment")
	@GeneratedValue(generator = "empGen")
	@Column(name = "EMPNO", length = 10, unique = true)
	@Type(type = "int")
	private Integer empNo;
	@Column(name = "FNAME", length = 20, nullable = false)
	@Type(type = "string")
	private String fName;
	@Column(name = "LNAME", length = 20, nullable = false)
	@Type(type = "string")
	private String lName;
	@Column(name = "EMAIL",length = 20,nullable = false)
	@Type(type="string")
	private String email;
	@Column(name = "MOBILENO",length = 10,nullable = false)
	@Type(type="long")
	private Long mobileNo;

}
