package com.poc.wso2.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.poc.wso2.entity.Customer;
import com.poc.wso2.entity.CustomerAddress;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerName(rs.getString("name"));
		customer.setCustomerAddress((CustomerAddress) rs.getObject("address"));
		customer.setCustomerEmail(rs.getString("email"));
		customer.setCustomerType(rs.getString("custtype"));
        return customer;
	}


}
