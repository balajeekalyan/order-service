package com.example.orders.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.orders.model.Shipment;

public interface ShipmentRepository extends MongoRepository<Shipment, String> {

	Shipment findBySid(String sid);
	
}
