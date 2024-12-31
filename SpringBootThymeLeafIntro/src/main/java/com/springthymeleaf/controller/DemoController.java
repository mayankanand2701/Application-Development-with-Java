package com.springthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
//	@RequestMapping("/sayDemo")
//	public String sayDemo()
//	{
//		// this demo is the name of the HTML page that we have
//		return "demo";
//	}
//	@RequestMapping("/dataDemo")
//	public String sayDemo(Model model)
//	{
//		// adding data to the model
//		// msg is the key and Spring Class is the value
//		model.addAttribute("msg","Spring Class");
//		return "demo";
//	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		model.addAttribute("msg","Kindly filll the form");
		return "showForm";
	}
	
	@RequestMapping("/filledForm")
	public String filledForm(@RequestParam("fname")String fname,@RequestParam("lname")String lname,Model model)
	{
		model.addAttribute("msg","Thank You");
		model.addAttribute("fn",(fname+" "+lname).toUpperCase());
		return "filledForm";
	}

	
}
