package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.Employee;
import com.jpa.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	// to insert a single data
	public Employee insertEmployee(Employee employee)
	{
		return repository.save(employee);
	}
	
	// to insert multiple data 
	public List<Employee> insertEmployees(List<Employee> employees)
	{
		return repository.saveAll(employees);
	}
	
	public List<Employee> getEmployee()
	{
		return repository.findAll();
	}
	
	public Employee getEmployeeById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public String deleteEmployee(int id)
	{
		repository.deleteById(id);
		return "Employee Record Deleted Successfully";
	}
	
	// there is no inbuilt method for update so we need to write it manually
	public Employee updateEmployee(Employee employee)
	{
		Employee e=repository.findById(employee.getId()).orElse(null);
		
		e.setName(employee.getName());
		e.setSalary(employee.getSalary());
		
		return repository.save(e);
		
	}

}
