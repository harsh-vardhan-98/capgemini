package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	
	@GetMapping("/add/{a}/{b}")
	public long add(@PathVariable("a") long a, @PathVariable("b") long b) {
		return a+b;
	}
	
	
	@GetMapping("/subtraction/{a}/{b}")
	public long subtraction(@PathVariable("a") long a, @PathVariable("b") long b) {
		return a-b;
	}
	
	@GetMapping("/multiply/{a}/{b}")
	public long multiply(@PathVariable("a") long a, @PathVariable("b") long b) {
		return a*b;
	}
	
	@GetMapping("/divide/{a}/{b}")
	public double divide(@PathVariable("a") long a, @PathVariable("b") long b) {
		return a/b;
	}
	
	@GetMapping("/square/{a}")
	public long add(@PathVariable("a") long a) {
		return (long) Math.pow(a, 0.5);
	}
}
