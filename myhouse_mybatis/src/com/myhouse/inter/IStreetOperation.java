package com.myhouse.inter;

import java.util.List;

import com.myhouse.entity.Street;

public interface IStreetOperation {
	public List<Street> selStreet();
	public Street selStreetById(int id);
}
