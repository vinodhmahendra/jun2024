package com.simplilearn.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Welcome;


@RestController
public class WelcomeResource {
	
	//HTTP Method : GET , URI : /welcome
	@GetMapping("/welcome")
	public Welcome getWelcomeMessage() {
		return new Welcome(); // return an Java Object
	}

}
