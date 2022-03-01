package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductRepo productRepo;
	
	
	@GetMapping("/")
	public List<Product> getProducts(){
		return productRepo.getAllProduct();
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable String id) {
		return productRepo.getProduct(id);
	}
	
	@PostMapping("/")
	public void addProduct(@RequestBody Product product) {
		productRepo.addProduct(product);
	}
	
	@PutMapping("/update/{id}")
	public void updateProduct(@PathVariable String id) {
		productRepo.update(id);
	}
	
	@GetMapping("/findByName/{name}")
	public List<Product> findByName(@PathVariable String name){
		return productRepo.findByName(name);
	}
	
	
}
