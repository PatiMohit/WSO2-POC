package com.poc.wso2.entity;

public class CustomerAddress {
String subaddress1;
public String getSubaddress1() {
	return subaddress1;
}
public void setSubaddress1(String subaddress1) {
	this.subaddress1 = subaddress1;
}
public String getSubaddress2() {
	return subaddress2;
}
@Override
public String toString() {
	return  "House no. - "+ subaddress1 + ", Area - " + subaddress2 + ", Country - "+  subaddress3;
}
public void setSubaddress2(String subaddress2) {
	this.subaddress2 = subaddress2;
}
public String getSubaddress3() {
	return subaddress3;
}
public void setSubaddress3(String subaddress3) {
	this.subaddress3 = subaddress3;
}
String subaddress2;
String subaddress3;
}
