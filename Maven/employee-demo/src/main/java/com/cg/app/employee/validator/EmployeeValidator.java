package com.cg.app.employee.validator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cg.app.employee.poop.Employee;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee employee =(Employee)target;
		
		if(employee.getEmpId()==0) {
			errors.rejectValue("empId", "empId.length", "Employee Id must be higher than 0");
		}
		if(employee.getEmpName().length()<2) {
			errors.rejectValue("empName", "empName.length", "Employee Name must have 2 or more charchters");
		}
		if(employee.getSalary()<100000) {
			errors.rejectValue("salary", "empName.length", "Salary must be higher than 100000");
		}
		
	}

}
