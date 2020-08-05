package com.poc.wso2.dao;

import java.util.List;

import com.poc.wso2.entity.Customer;
import com.poc.wso2.entity.Customer;

public interface CustomerDao {

	List<Customer> findAll();

	void insertCustomer(Customer customer,String type);

	void updateCustomer(Customer customer);

	void executeUpdateCustomer(Customer customer);

	public void deleteCustomer(Customer customer);
}
