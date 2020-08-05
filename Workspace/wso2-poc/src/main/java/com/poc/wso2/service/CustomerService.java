package com.poc.wso2.service;

import java.util.List;

import com.poc.wso2.entity.Customer;

public interface CustomerService {
	List<Customer> findAll();

	void insertEmployee(Customer cust, String custType);

	void updateEmployee(Customer cust);

	void executeUpdateEmployee(Customer cust);

	void deleteEmployee(Customer cust);

}
