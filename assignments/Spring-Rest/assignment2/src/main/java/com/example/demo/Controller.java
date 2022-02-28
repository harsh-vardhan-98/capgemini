package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private ValidOrNot validOrNot;
	
	
	@GetMapping("/{username}/{password}")
	public String authenticate(@PathVariable("username") String username , @PathVariable("password") String password) {
		
		if(username.equals(validOrNot.getUsername()) && (password.equals(validOrNot.getPassword()))){
			return "Valid";
		}else {
			return "Not Valid";
		
		}
		
		
	}

}
