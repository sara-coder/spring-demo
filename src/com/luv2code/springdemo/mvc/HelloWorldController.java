package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	//need a controller method to show form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process a form

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}//controller method to read data and add data to model
	@RequestMapping("/processFormUpperCase")
	public String processFormUpperCase(HttpServletRequest request, Model model ) {
		// read request form data
		
		String name= request.getParameter("studentName");
		name=name.toUpperCase();
		String result = "Welcome "+name;
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	@RequestMapping("/processFormUpperCaseNew")
	public String processFormUpperCaseNew(@RequestParam("studentName") String name, Model model ) {
		// read request form data
		
		//String name= request.getParameter("studentName");
		name=name.toUpperCase();
		String result = "Welcome new user: "+name;
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
}
