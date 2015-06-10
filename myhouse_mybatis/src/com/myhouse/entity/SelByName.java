package com.myhouse.entity;

public class SelByName {
	private int pageindex;
	private int pagesize;
	private String name;
	public SelByName(int pageindex, int pagesize, String name) {
		super();
		this.pageindex = pageindex;
		this.pagesize = pagesize;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
