package com.yash.controller;

public class Admin {

	public Admin() {
		super();
	}

	
	public Admin(int aid, String username, String name, String password, String item, String category,
			String customer,int uid) {
		super();
		this.aid = aid;
		this.username = username;
		this.name = name;
		this.password = password;
		this.item = item;
		this.category = category;
		this.customer = customer;
	}


	int aid;
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	String username;
	String name;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	String item;
	String category;
	String customer;
	public String getItem() {
		return item;
	}

	public int getCatid() {
		return catid;
	}


	public void setCatid(int catid) {
		this.catid = catid;
	}


	public String getCategoryname() {
		return categoryname;
	}


	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}


	public int getItemid() {
		return itemid;
	}


	public void setItemid(int itemid) {
		this.itemid = itemid;
	}


	public String getItemname() {
		return itemname;
	}


	public void setItemname(String itemname) {
		this.itemname = itemname;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getDom() {
		return dom;
	}


	public void setDom(String dom) {
		this.dom = dom;
	}


	public String getDoe() {
		return doe;
	}


	public void setDoe(String doe) {
		this.doe = doe;
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

	int uid;
	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}
	
	 int catid;
	 
	String categoryname;

	int itemid;
	String  itemname;
	String price;
	String dom;
	String doe;
	 int custid;
	 String custname, emailid ;
	 String password, address, mobileno;


}
