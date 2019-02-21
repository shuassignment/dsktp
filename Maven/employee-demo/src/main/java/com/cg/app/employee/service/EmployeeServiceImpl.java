package com.cg.app.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.employee.dao.EmployeeDAO;
import com.cg.app.employee.poop.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public void insertEmployee(Employee employee) {
		dao.insertEmployee(employee);	
	}
	
}
