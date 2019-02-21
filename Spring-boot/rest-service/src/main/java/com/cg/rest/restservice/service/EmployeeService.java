package com.cg.rest.restservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.rest.restservice.entity.Employee;

@Service
public interface EmployeeService {

	void addNewEmployee(Employee employee);

	List<Employee> getAllEmployees();

	void updateEmployee(Employee employee);

	void deleteEmployee(int empId);

	Employee getEmployeeById(int empId);

}