package com.manash.config;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMP")
public class Employee implements Serializable{
	
	@Id
	@Column(name = "EMPNO")
	private int empNO;
	@Column(name = "ENAME")
	private String empName;
	@Column(name = "SAL")
	private int sal;
	@Column(name = "JOB")
	private String job;
	

}
