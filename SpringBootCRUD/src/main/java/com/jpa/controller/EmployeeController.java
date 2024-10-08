package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Employee;
import com.jpa.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/insertEmployee")
	public String insert(@RequestBody Employee employee)
	{
		employeeService.insertEmployee(employee);
		return "Record Inserted Successfully";
	}
	
	@PostMapping("/insertEmployees")
	public String inserts(@RequestBody List<Employee> employees)
	{
		employeeService.insertEmployees(employees);
		return "Multiple Record Inserted Successfully";
	}
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees()
	{
		return employeeService.getEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findAllEmployeeById(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	
	@PutMapping("/update")
	public Employee updateProduct(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		return employeeService.deleteEmployee(id);
	}
}
