package com.poc.wso2.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.poc.wso2.entity.Person;

public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int arg1) throws SQLException {
		Person person = new Person();
		person.setPersonName(rs.getString("personName"));
		person.setPersonAddress(rs.getString("personAddress"));
		//person.setPersonEmail(rs.getString("personEmail"));
        return person;
	}


}
