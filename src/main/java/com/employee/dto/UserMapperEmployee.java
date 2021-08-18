package com.employee.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.employee.model.Employee;

class UserMapperEmployee implements RowMapper {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee user = new Employee();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("emp_name"));
		user.setAge(rs.getString("age"));		
		return user;
	}

}
