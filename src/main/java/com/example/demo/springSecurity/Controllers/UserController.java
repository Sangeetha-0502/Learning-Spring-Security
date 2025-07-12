package com.example.demo.springSecurity.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/")
	public String greetings() {
		return "Hello world";
	}
	
	@GetMapping("/custom-logout")
	public String logout() {
		return "you have been logged out";
	}

}
