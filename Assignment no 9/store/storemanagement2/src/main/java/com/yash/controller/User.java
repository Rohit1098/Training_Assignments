package com.yash.controller;

public class User {
	int uid;
private String item;
private String category;
private String customer;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getCustomer() {
	return customer;
}
public void setCustomer(String customer) {
	this.customer = customer;
}
public User(int uid, String item, String category, String customer) {
	super();
	this.uid = uid;
	this.item = item;
	this.category = category;
	this.customer = customer;
}

public User() {
	super();
}

}
