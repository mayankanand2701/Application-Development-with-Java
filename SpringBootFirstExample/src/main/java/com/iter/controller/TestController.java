package com.iter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@ResponseBody
public class TestController {
	
	//@GetMapping("/hello")
	@RequestMapping("/hello")
	public String display()
	{
		return "Welcome to Java Spring Boot";
	}

}
