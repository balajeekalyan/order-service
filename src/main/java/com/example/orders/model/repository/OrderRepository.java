package com.example.orders.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.orders.model.Order;

public interface OrderRepository extends MongoRepository<Order, String>  {
	
	Order findByUniqueIdentifier(String uniqueIdentifier);
	
}
