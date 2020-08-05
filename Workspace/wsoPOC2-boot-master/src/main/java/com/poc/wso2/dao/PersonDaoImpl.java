package com.poc.wso2.dao;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.poc.wso2.entity.Person;
import com.poc.wso2.mapper.PersonRowMapper;

@Repository
public class PersonDaoImpl implements PersonDao {

	public PersonDaoImpl(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	NamedParameterJdbcTemplate template;

	@Override
	public List<Person> findAll() {
		return template.query("select * from person", new PersonRowMapper());
	}

	@Override
	public void insertPerson(Person person) {
		final String sql = "insert into person(personName, personAddress) " + "values(:personName,:personAddress)";

		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("personName", person.getPersonName())
				.addValue("personAddress", person.getPersonAddress());
				//.addValue("personEmail", person.getPersonEmail()
		
		template.update(sql, param, holder);
	}

	@Override
	public void updatePerson(Person emp) {
		// not need now
	}

	@Override
	public void executeUpdatePerson(Person emp) {
		// not needed now
	}

	@Override
	public void deletePerson(Person emp) {
		// not needed now
	}

}
