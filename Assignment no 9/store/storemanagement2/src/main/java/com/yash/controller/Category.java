package com.yash.controller;

public class Category {
	 int catid;
	 public Category() {
		 super();
	 }
	 public Category(int catid, String categoryname) {
		super();
		this.catid = catid;
		this.categoryname = categoryname;
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
	String categoryname;
}
