package com.zensar.webapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProgramController {

	@GetMapping("/greet")
	public String sayHello()
	{
		return "Welcome to hello";
	}

}
