package com.example.orders.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.orders.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	Customer findByDunsNumber(String dunsNumber);
	
	Customer findByAdapter(String adapter);
	
}
