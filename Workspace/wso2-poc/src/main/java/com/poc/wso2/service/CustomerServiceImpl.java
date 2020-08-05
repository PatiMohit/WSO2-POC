package com.poc.wso2.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.poc.wso2.dao.CustomerDao;
import com.poc.wso2.entity.Customer;

@Component
public class CustomerServiceImpl implements CustomerService {
	@Resource
	CustomerDao customerDao;

	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	@Override
	public void insertEmployee(Customer customer, String custType) {
		customerDao.insertCustomer(customer,custType);

	}

	@Override
	public void updateEmployee(Customer customer) {
		customerDao.updateCustomer(customer);

	}

	@Override
	public void executeUpdateEmployee(Customer customer) {
		customerDao.executeUpdateCustomer(customer);

	}

	@Override
	public void deleteEmployee(Customer customer) {
		customerDao.deleteCustomer(customer);

	}
}
