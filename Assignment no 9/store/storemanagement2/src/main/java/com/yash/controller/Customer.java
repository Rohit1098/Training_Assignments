package com.yash.controller;

public class Customer {
	int custid;
	
	public Customer() {
		super();
	}
	public Customer(int custid, String custname, String emailid, String password, String address, String mobileno) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.emailid = emailid;
		this.password = password;
		this.address = address;
		this.mobileno = mobileno;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	String custname, emailid,password, address, mobileno;
}
