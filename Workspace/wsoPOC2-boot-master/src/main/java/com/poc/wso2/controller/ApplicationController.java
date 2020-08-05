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

import com.poc.wso2.entity.Person;
import com.poc.wso2.service.PersonService;

@RestController
@RequestMapping("/wsoPOCApp")
public class ApplicationController {

	@Resource
	PersonService personService;

	@GetMapping(value = "/personList")
	public List<Person> getEmployees() {
		return personService.findAll();

	}

	@PostMapping(value = "/createPerson")
	public void createEmployee(@RequestBody Person person) {
		personService.insertEmployee(person);

	}

	@PutMapping(value = "/updatePerson")
	public void updateEmployee(@RequestBody Person person) {
		personService.updateEmployee(person);

	}

	@PutMapping(value = "/executeUpdatePerson")
	public void executeUpdateEmployee(@RequestBody Person person) {
		personService.executeUpdateEmployee(person);

	}

	@DeleteMapping(value = "/deletePersonById")
	public void deleteEmployee(@RequestBody Person person) {
		personService.deleteEmployee(person);

	}

}
