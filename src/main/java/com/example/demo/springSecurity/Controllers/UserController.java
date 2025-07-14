package com.example.demo.springSecurity.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.springSecurity.Services.UserService;
import com.example.demo.springSecurity.entities.AppUser;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String greetings() {
		return "Hello world";
	}
	
	@GetMapping("/custom-logout")
	public String logout() {
		return "you have been logged out";
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody AppUser user) {
	    AppUser isSaved = userService.registerUser(user);

	    if (isSaved != null) {
	        return ResponseEntity
	            .status(HttpStatus.CREATED)
	            .body("User registered successfully");
	    } else {
	        return ResponseEntity
	            .status(HttpStatus.BAD_REQUEST)
	            .body("User registration failed");
	    }
	}


}
