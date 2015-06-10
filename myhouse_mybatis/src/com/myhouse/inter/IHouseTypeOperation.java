package com.myhouse.inter;

import java.util.List;

import com.myhouse.entity.HouseType;

public interface IHouseTypeOperation {
	public List<HouseType> selAllHouseType();
	public HouseType selHouseTypeById(int id);
}
