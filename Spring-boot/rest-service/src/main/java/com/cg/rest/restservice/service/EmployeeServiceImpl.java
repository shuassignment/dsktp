package com.cg.rest.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.restservice.entity.Employee;
import com.cg.rest.restservice.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		Employee employee = repository.getOne(empId);
		repository.delete(employee);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return repository.findById(empId).get();
	}

}
