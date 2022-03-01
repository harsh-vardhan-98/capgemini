package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	private  OrderRepo orderRepo;
	
	
	@GetMapping("/")
	public List<Order> getAllOrder(){
		List list = orderRepo.findAll();
		return list;
	}
	
	
	@PostMapping("/")
	public String addOrder(@RequestBody Order order) {
		orderRepo.save(order);
		return "Saved";
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleted(@PathVariable("id") String orderName) {
		orderRepo.deleteById(orderName);
		return "deleted";
	}
	
	
	
	
	
	
}
