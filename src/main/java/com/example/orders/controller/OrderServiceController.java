package com.example.orders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.orders.model.Order;
import com.example.orders.model.Shipment;
import com.example.orders.model.repository.CustomerRepository;
import com.example.orders.model.repository.OrderRepository;
import com.example.orders.model.repository.ShipmentRepository;

@RestController
@RequestMapping("/order-service")
public class OrderServiceController {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ShipmentRepository shipmentRepository;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Order createCustomer(@RequestBody Order order) {
		if (order.getCustomer() != null) {
			customerRepository.save(order.getCustomer());
		}
		if (order.getCusDunsNumber() != null) {
			order.setCustomer(customerRepository.findByDunsNumber(order.getCusDunsNumber()));
		}
		Order updateOrder = orderRepository.findByUniqueIdentifier(order.getUniqueIdentifier());
		if (updateOrder != null) {
			order = new Order(updateOrder);
		}
		orderRepository.save(order);
		Shipment shipment = new Shipment(order);
		shipmentRepository.save(shipment);
		return order;
	}

}
