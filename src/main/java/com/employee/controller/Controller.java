package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.ReadValue;
import com.employee.model.Employee;

@RestController
public class Controller {
	ReadValue read;
	@Autowired
	public Controller(ReadValue read) {//constructor dependency injection
			this.read=read;
	}
	@GetMapping("employee")	
	public List<Employee> getListOfEmp() {//POJO class. it'll contain the data
		System.out.println("get request");
		return read.listOfEmployee();
		
	}
	
	
}
