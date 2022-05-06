package com.yash.controller;

public class Item {
	int itemid,catid;
	String  itemname,price, dom, doe;
	
	public Item() {
		super();
	}
	public Item(int itemid, int catid, String itemname, String price, String dom, String doe) {
		super();
		this.itemid = itemid;
		this.catid = catid;
		this.itemname = itemname;
		this.price = price;
		this.dom = dom;
		this.doe = doe;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
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
}
