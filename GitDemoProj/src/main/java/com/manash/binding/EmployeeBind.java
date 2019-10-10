package com.manash.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class EmployeeBind {
	
	private int empNO;
	private String empName;
	private int sal;
	private String job;

}
