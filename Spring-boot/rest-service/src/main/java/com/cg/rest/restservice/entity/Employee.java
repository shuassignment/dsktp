package com.cg.rest.restservice.entity;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	@Id
	private Integer empId;
	private Double salary;
	private String empName;

	@Embedded
	private Address address;

	public Employee() {
	}

	public Employee(Integer empId, Double salary, String empName, Address address) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.empName = empName;
		this.address = address;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
