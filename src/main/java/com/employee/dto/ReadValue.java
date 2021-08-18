package com.employee.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public class ReadValue {
	@Autowired
	private JdbcTemplate jdbcTemplate;//field injection happened here.
	
	public List<Employee> listOfEmployee() {					
		String query="select * from employees";	
		return jdbcTemplate.query(query, new UserMapperEmployee());
	}
}
