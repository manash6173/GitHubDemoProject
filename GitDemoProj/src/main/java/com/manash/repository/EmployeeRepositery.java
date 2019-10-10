package com.manash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manash.config.Employee;

@Repository("empRepo")
public interface EmployeeRepositery extends JpaRepository<Employee,Serializable> {

}
