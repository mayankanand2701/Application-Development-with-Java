package com.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testing")
public class demoController {
	@GetMapping("/welcome")
	public String sayHello() {
		return "Hello World";
	}
}
