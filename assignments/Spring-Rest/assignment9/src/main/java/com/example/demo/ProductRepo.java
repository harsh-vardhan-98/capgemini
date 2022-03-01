package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class ProductRepo {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	public List<Product> getAllProduct(){
		return mongoTemplate.findAll(Product.class);
	}
	
	
	public Product getProduct(String id) {
		return mongoTemplate.findById(id, Product.class);
	}
	
	
	public void addProduct(Product product) {
		mongoTemplate.save(product);
	}
	
	public void update(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where(id).is(id));
		Product p = mongoTemplate.findOne(query, Product.class);
		p.setPrice(30000);
		mongoTemplate.save(p);
	}
	
	public List<Product> findByName(String name){
		Query query = new Query();
		query.addCriteria(Criteria.where(name).is(name));
		return mongoTemplate.find(query, Product.class);
		
	}
	

}
