package com.myhouse.entity;

public class SelCountByAll {
	private int low_price;
	private int high_price;
	private String title;
	private String type_id;
	private String street_id;
	private int low_floorage;
	private int high_floorage;
	public SelCountByAll(int lowPrice, int highPrice, String title,
			String typeId, String streetId, int lowFloorage, int highFloorage) {
		super();
		low_price = lowPrice;
		high_price = highPrice;
		this.title = title;
		type_id = typeId;
		street_id = streetId;
		low_floorage = lowFloorage;
		high_floorage = highFloorage;
	}
	public int getLow_price() {
		return low_price;
	}
	public void setLow_price(int lowPrice) {
		low_price = lowPrice;
	}
	public int getHigh_price() {
		return high_price;
	}
	public void setHigh_price(int highPrice) {
		high_price = highPrice;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType_id() {
		return type_id;
	}
	public void setType_id(String typeId) {
		type_id = typeId;
	}
	public String getStreet_id() {
		return street_id;
	}
	public void setStreet_id(String streetId) {
		street_id = streetId;
	}
	public int getLow_floorage() {
		return low_floorage;
	}
	public void setLow_floorage(int lowFloorage) {
		low_floorage = lowFloorage;
	}
	public int getHigh_floorage() {
		return high_floorage;
	}
	public void setHigh_floorage(int highFloorage) {
		high_floorage = highFloorage;
	}
	
}
