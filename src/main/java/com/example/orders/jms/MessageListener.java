package com.example.orders.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.orders.model.Order;
import com.example.orders.model.Shipment;
import com.example.orders.model.repository.OrderRepository;
import com.example.orders.model.repository.ShipmentRepository;

@Component
public class MessageListener {
	
	@Autowired
	private ShipmentRepository shipmentRepository;
	
	@Autowired
	private OrderRepository orderRepository;
		
	@JmsListener(destination = "edi.queue", containerFactory = "myFactory")
	public void receiveMessage(com.example.jms.EdiStatus ediStatus) {
		Shipment shipment = shipmentRepository.findBySid(ediStatus.getSid());
		Order order = orderRepository.findByUniqueIdentifier(ediStatus.getSid());
		if (ediStatus.getStatus().equals("AF")) {
			shipment.setStatus("IN TRANSIT");
			shipment.setActualPickupDateMin(ediStatus.getEventDate());
			shipment.setActualPickupDateMax(ediStatus.getEventDate());
			order.setStatus(shipment.getStatus());
			order.setActualPickupDateMin(shipment.getActualPickupDateMin());
			order.setActualPickupDateMax(shipment.getActualPickupDateMax());
		} else if (ediStatus.getStatus().equals("A") || ediStatus.getStatus().equals("X4")) {
			shipment.setStatus("DELIVERED");
			shipment.setActualArrivalDateMin(ediStatus.getEventDate());
			shipment.setActualArrivalDateMax(ediStatus.getEventDate());
			order.setStatus(shipment.getStatus());
			order.setActualArrivalDateMin(shipment.getActualArrivalDateMin());
			order.setActualArrivalDateMax(shipment.getActualArrivalDateMax());
		}
		shipmentRepository.save(shipment);
		orderRepository.save(order);
	}
}
