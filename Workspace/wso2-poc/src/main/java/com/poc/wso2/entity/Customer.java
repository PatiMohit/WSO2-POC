package com.poc.wso2.entity;

public class Customer {

	String customerName;
	CustomerAddress customerAddress;
	String customerEmail;
	String customerType;

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerAddress=" + customerAddress + ", customerEmail="
				+ customerEmail + ", customerType=" + customerType + "]";
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

}
