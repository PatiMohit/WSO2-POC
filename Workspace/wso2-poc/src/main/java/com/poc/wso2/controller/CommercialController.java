package com.poc.wso2.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.wso2.entity.Customer;
import com.poc.wso2.service.CustomerService;

@RestController
@RequestMapping("/CommercialCustomer")
public class CommercialController {
	@Resource
	CustomerService customerService;

	@GetMapping(value = "/customerList")
	public List<Customer> getEmployees() {
		return customerService.findAll();

	}

	@PostMapping(value = "/createCustomer")
	public void createEmployee(@RequestBody Customer customer) {
		customerService.insertEmployee(customer,"C");

	}

	@PutMapping(value = "/updateCustomer")
	public void updateEmployee(@RequestBody Customer customer) {
		customerService.updateEmployee(customer);

	}

	@PutMapping(value = "/executeUpdateCustomer")
	public void executeUpdateEmployee(@RequestBody Customer customer) {
		customerService.executeUpdateEmployee(customer);

	}

	@DeleteMapping(value = "/deleteCustomerById")
	public void deleteEmployee(@RequestBody Customer customer) {
		customerService.deleteEmployee(customer);

	}
}
