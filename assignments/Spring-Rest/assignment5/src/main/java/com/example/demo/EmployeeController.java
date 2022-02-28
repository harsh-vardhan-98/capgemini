package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

	@Autowired
	 private EmployeeRepo employeeRepo;
	
	@GetMapping("/")
	public List<Employee> getEmployees(){
		List employee = employeeRepo.findAll();
		return employee;
	}
	
	
	@PostMapping("/")
	public String addEmployee(@RequestBody Employee employee) {
				employeeRepo.save(employee);
			
				return "OK";
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") long id) {
		employeeRepo.deleteById(id);
		return "deleted";
	}
	
	
	
}
