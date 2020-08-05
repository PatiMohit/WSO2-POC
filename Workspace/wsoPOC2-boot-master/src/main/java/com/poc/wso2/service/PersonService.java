package com.poc.wso2.service;

import java.util.List;

import com.poc.wso2.entity.Person;

public interface PersonService {
	List<Person> findAll();

	void insertEmployee(Person emp);

	void updateEmployee(Person emp);

	void executeUpdateEmployee(Person emp);

	void deleteEmployee(Person emp);

}
