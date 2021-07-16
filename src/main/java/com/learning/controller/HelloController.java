package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("I m reaching to my controller");
		return "test"; //view
	}

}
