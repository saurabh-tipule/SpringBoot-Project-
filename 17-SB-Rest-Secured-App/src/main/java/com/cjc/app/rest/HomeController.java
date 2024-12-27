package com.cjc.app.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	int x = 10;
	
	@RequestMapping(value = "/welcome")
	public String welcomePage() {
		String msg = "Welcome Page Called..!";
		return msg;
	}

	@RequestMapping(value = "/home")
	public String homePage() {
		String msg = "Home Page Called..!";
		return msg;
	}

	@RequestMapping(value = "/student")
	public String studentPage() {
		String msg = "Student Page Called..!";
		return msg;
	}

	@RequestMapping(value = "/employee")
	public String employeePage() {
		String msg = "Employee Page Called..!";
		return msg;
	}

	@RequestMapping(value = "/admin")
	public String adminPage() {
		String msg = "Aadmin Page Called..!";
		return msg;
	}

}
