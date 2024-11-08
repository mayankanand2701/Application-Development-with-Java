package com.spjparest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spjparest.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	

}
