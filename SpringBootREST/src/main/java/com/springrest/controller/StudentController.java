package com.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.entity.Student;


@RestController
@RequestMapping("api")
public class StudentController {
	List<Student> l=new ArrayList<Student>();
	@GetMapping("/students")
	public List<Student> getStud()
	{
//		List<Student> l=new ArrayList<Student>();
		l.add(new Student("Mayank",12,"Anand"));
		l.add(new Student("Mayank",12,"Raj"));
		l.add(new Student("Raj",12,"Anand"));
		return l;
	}
	
	@GetMapping("/students/{index}")
	public Student getAStud(@PathVariable int index)
	{
		return l.get(index);
	} 

}
