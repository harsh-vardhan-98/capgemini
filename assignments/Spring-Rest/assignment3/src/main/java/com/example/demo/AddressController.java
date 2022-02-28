package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@Autowired
	private AddressRepo addressrepo;
	

	@GetMapping("/")
	public List<Address> getAllAddress() {
		List<Address> address = addressrepo.findAll();
		return address;
	}
	
	
	@GetMapping("/{pin}")
	public Optional<Address> getAddress(@PathVariable("pin") long pin) {
		Optional<Address> address = addressrepo.findById(pin);
		return address;
	}
	
	@PostMapping("/")
	public String addAddress(@RequestBody Address address) {
		
		addressrepo.save(address);
		
		return "saved"+ address.toString();
		
	}
	
}
