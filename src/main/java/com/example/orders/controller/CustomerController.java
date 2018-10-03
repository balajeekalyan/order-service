package com.example.orders.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.orders.model.Customer;
import com.example.orders.model.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	 @Autowired
	 private CustomerRepository customerRepository;
	 
	 @RequestMapping(value = "/create", method = RequestMethod.POST)
	 public Customer createCustomer(@RequestBody Customer customer) {
		 customerRepository.save(customer);
		 return customer;
	 }
	 
	 @RequestMapping(value = "/updateByDuns/{dunsNumber}", method = RequestMethod.PUT)
	 public Customer updateCustomerByDuns(@PathVariable("dunsNumber") String dunsNumber, @RequestBody Customer customer) {
		 Customer updateCustomer = customerRepository.findByDunsNumber(dunsNumber);
		 customer.setId(updateCustomer.getId());
		 customer.setName((customer.getName() != null ? customer.getName() : updateCustomer.getName()));
		 customer.setAddress((customer.getAddress() != null ? customer.getAddress() : updateCustomer.getAddress()));
		 customer.setAdapter((customer.getAdapter() != null ? customer.getAdapter() : updateCustomer.getAdapter()));
		 customer.setActiveFlg(updateCustomer.getActiveFlg());
		 customer.setUpdateDate((updateCustomer.getUpdateDate() != null ? updateCustomer.getUpdateDate() : new Date()));
		 customer.setUpdateUser((customer.getUpdateUser() != null ? customer.getUpdateUser() : updateCustomer.getUpdateUser()));
		 customer.setActiveFlg(updateCustomer.getActiveFlg());
		 customer.setVersion(updateCustomer.getVersion() + 1);
		 customerRepository.save(customer);
		 return customer;
	 }
	 
	 @RequestMapping(value = "/updateByAdapter/{adapter}", method = RequestMethod.PUT)
	 public Customer updateCustomerByAdapter(@PathVariable("adapter") String adapter, @RequestBody Customer customer) {
		 Customer updateCustomer = customerRepository.findByAdapter(adapter);
		 customer.setId(updateCustomer.getId());
		 customer.setName((customer.getName() != null ? customer.getName() : updateCustomer.getName()));
		 customer.setAddress((customer.getAddress() != null ? customer.getAddress() : updateCustomer.getAddress()));
		 customer.setDunsNumber((customer.getDunsNumber() != null ? customer.getDunsNumber() : updateCustomer.getDunsNumber()));
		 customer.setActiveFlg(updateCustomer.getActiveFlg());
		 customer.setUpdateDate((updateCustomer.getUpdateDate() != null ? updateCustomer.getUpdateDate() : new Date()));
		 customer.setUpdateUser((customer.getUpdateUser() != null ? customer.getUpdateUser() : updateCustomer.getUpdateUser()));
		 customer.setActiveFlg(updateCustomer.getActiveFlg());
		 customer.setVersion(updateCustomer.getVersion() + 1);
		 customerRepository.save(customer);
		 return customer;
	 }
	 
	 @RequestMapping(value = "/invalidateByDuns/{dunsNumber}", method = RequestMethod.PUT)
	 public Customer invalidateByDuns(@PathVariable("dunsNumber") String dunsNumber) {
		 Customer updateCustomer = customerRepository.findByDunsNumber(dunsNumber);
		 updateCustomer.setId(updateCustomer.getId());
		 updateCustomer.setActiveFlg("N");
		 customerRepository.save(updateCustomer);
		 return updateCustomer;
	 }
	 
	 @RequestMapping(value = "/invalidateByAdapter/{adapter}", method = RequestMethod.PUT)
	 public Customer invalidateByAdapter(@PathVariable("adapter") String adapter) {
		 Customer updateCustomer = customerRepository.findByAdapter(adapter);
		 updateCustomer.setId(updateCustomer.getId());
		 updateCustomer.setActiveFlg("N");
		 customerRepository.save(updateCustomer);
		 return updateCustomer;
	 }
	
}
