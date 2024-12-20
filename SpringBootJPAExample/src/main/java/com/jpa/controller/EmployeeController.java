package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Employee;
import com.jpa.repository.EmployeeRepository;

// Difference between @RestController and @Controller (VVI Question)

// It deals with JSON Data
// It depicts the class is the controller component
@RestController
public class EmployeeController {
	
	// One file object is created in another files in such case we should use this annotations
	// Automatically whatever configuration required will come
	@Autowired
	EmployeeRepository employeeRepository;

	@PostMapping("/employees")
	public String insertEmployee(@RequestBody Employee employee)
	{
		employeeRepository.save(employee);
		return "One Record Successfully Saved";
	}
	
	@PostMapping("/multipleemployees")
	public String insertBooks(@RequestBody List<Employee> employee)
	{
		employeeRepository.saveAll(employee);
		return "Multiple Record Successfully Saved";
	}
	
}
