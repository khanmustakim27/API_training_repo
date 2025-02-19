package com.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcontroller {

	@RequestMapping("/emplist")
	public String displayEmployee() {
		return "employee.html";
	}
}
