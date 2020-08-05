package com.poc.wso2.dao;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.poc.wso2.entity.Customer;
import com.poc.wso2.mapper.CustomerRowMapper;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	public CustomerDaoImpl(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	NamedParameterJdbcTemplate template;

	@Override
	public List<Customer> findAll() {
		return template.query("select * from customer", new CustomerRowMapper());
	}

	@Override
	public void insertCustomer(Customer customer, String custType) {
		String type=null;
		if(custType.equals("R")) {
			type="Residential";
		}
		else {
			type="Commercial";
		}
		final String sql = "insert into customer(Name, Address,Email,custType) " +
				"values(:customerName,:customerAddress,:customerEmail,:customerType)";

		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("customerName", customer.getCustomerName())
				.addValue("customerAddress", customer.getCustomerAddress().toString())
				.addValue("customerEmail", customer.getCustomerEmail())
				.addValue("customerType", type);
		
		template.update(sql, param, holder);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// not need now
	}

	@Override
	public void executeUpdateCustomer(Customer customer) {
		// not needed now
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// not needed now
	}

}
