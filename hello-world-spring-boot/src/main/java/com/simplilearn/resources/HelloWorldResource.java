package com.simplilearn.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	// URI : /
	//HTTP METHOD : GET
	@GetMapping("/")
	public String helloWorld() {
		return "Hello World! Spring Boot!";
	}
}
