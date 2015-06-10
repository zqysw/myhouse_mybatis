package com.myhouse.entity;

import java.util.Date;

public class HouseInfo {
	private int id;
	private String title;
	private int housetype;
	private double floorage;
	private double price;
	private Date housedate;
	private int district_id;
	private int street_id;
	private String phone;
	private String content;
	private String owner;
	
	

	public HouseInfo() {
		super();
	}
	
	public HouseInfo(String title, int housetype, double floorage,
			double price, int streetId) {
		super();
		this.title = title;
		this.housetype = housetype;
		this.floorage = floorage;
		this.price = price;
		street_id = streetId;
	}






	public HouseInfo(String title, int housetype, double floorage,
			double price, Date housedate, int districtId, int streetId,
			String phone, String content, String owner) {
		super();
		this.title = title;
		this.housetype = housetype;
		this.floorage = floorage;
		this.price = price;
		this.housedate = housedate;
		district_id = districtId;
		street_id = streetId;
		this.phone = phone;
		this.content = content;
		this.owner = owner;
	}
	

	public HouseInfo(int id, String title, int housetype, double floorage,
			double price, Date housedate, int districtId, int streetId,
			String phone, String content, String owner) {
		super();
		this.id = id;
		this.title = title;
		this.housetype = housetype;
		this.floorage = floorage;
		this.price = price;
		this.housedate = housedate;
		district_id = districtId;
		street_id = streetId;
		this.phone = phone;
		this.content = content;
		this.owner = owner;
	}



	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHousetype() {
		return housetype;
	}
	public void setHousetype(int housetype) {
		this.housetype = housetype;
	}
	public double getFloorage() {
		return floorage;
	}
	public void setFloorage(double floorage) {
		this.floorage = floorage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getHousedate() {
		return housedate;
	}
	public void setHousedate(Date housedate) {
		this.housedate = housedate;
	}
	public int getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(int districtId) {
		district_id = districtId;
	}
	public int getStreet_id() {
		return street_id;
	}
	public void setStreet_id(int streetId) {
		street_id = streetId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
