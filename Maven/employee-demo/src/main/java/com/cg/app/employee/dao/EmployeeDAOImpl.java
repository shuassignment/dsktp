package com.cg.app.employee.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.app.employee.dao.sql.SQLQueries;
import com.cg.app.employee.poop.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void insertEmployee(Employee employee) {
		jdbcTemplate.update(SQLQueries.getInstance().insertEmployee(),new Object[] {
				employee.getEmpId(), employee.getEmpName(), employee.getSalary()
		});
	}
	
}
