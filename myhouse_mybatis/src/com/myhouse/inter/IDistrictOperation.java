package com.myhouse.inter;

import java.util.List;

import com.myhouse.entity.District;

public interface IDistrictOperation {
	public List<District> selAllDistrict();
	public District selDistrictById(int id);
}
