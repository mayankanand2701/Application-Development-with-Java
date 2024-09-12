package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.entity.Employee;

// JpaRepository has a build in functions which we can call in order to save and manipulate data
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
