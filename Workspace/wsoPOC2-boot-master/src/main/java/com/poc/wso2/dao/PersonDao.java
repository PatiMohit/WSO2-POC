package com.poc.wso2.dao;

import java.util.List;

import com.poc.wso2.entity.Person;

public interface PersonDao {

	List<Person> findAll();

	void insertPerson(Person emp);

	void updatePerson(Person emp);

	void executeUpdatePerson(Person emp);

	public void deletePerson(Person emp);
}
