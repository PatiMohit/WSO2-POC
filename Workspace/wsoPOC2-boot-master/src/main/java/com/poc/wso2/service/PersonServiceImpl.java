package com.poc.wso2.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.poc.wso2.dao.PersonDao;
import com.poc.wso2.entity.Person;

@Component
public class PersonServiceImpl implements PersonService {
	@Resource
	PersonDao personDao;

	@Override
	public List<Person> findAll() {
		return personDao.findAll();
	}

	@Override
	public void insertEmployee(Person person) {
		personDao.insertPerson(person);

	}

	@Override
	public void updateEmployee(Person person) {
		personDao.updatePerson(person);

	}

	@Override
	public void executeUpdateEmployee(Person person) {
		personDao.executeUpdatePerson(person);

	}

	@Override
	public void deleteEmployee(Person person) {
		personDao.deletePerson(person);

	}
}
