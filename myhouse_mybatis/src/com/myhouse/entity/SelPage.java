package com.myhouse.entity;

public class SelPage {
	private int pageindex;
	private int pagesize;
	private String key;
	
	public SelPage(int pageindex, int pagesize, String key) {
		super();
		this.pageindex = pageindex;
		this.pagesize = pagesize;
		this.key = key;
	}
	public int getPageindex() {
		return pageindex;
	}
	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
