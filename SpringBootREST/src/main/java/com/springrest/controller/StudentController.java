package com.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.entity.Student;

import jakarta.annotation.PostConstruct;


@RestController
@RequestMapping("api")
public class StudentController {
	private List<Student> l;
	// to make the list accessible throughout the class
	//List<Student> l=new ArrayList<Student>();
	
	@PostConstruct
	public void loadData()
	{
		l=new ArrayList<Student>();
		l.add(new Student("Mayank",12,"Anand"));
	    l.add(new Student("Mishi",18,"Raj"));
	    l.add(new Student("Raj",10,"Kumar"));
	}
	@GetMapping("/students")
	public List<Student> getStud()
	{
		// List<Student> l=new ArrayList<Student>();
		// l.add(new Student("Mayank",12,"Anand"));
		// l.add(new Student("Mayank",12,"Raj"));
		// l.add(new Student("Raj",12,"Anand"));
		return l;
	}
	
	@GetMapping("/students/{index}")
	public Student getAStud(@PathVariable int index)
	{
		if(index>l.size() || index<0) 
		{
			throw new StudentNotFoundException("No Student with index "+index+" exist in the list.");
		}
		return l.get(index);
	}
}
