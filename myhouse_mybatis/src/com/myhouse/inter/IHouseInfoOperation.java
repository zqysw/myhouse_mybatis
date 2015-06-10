package com.myhouse.inter;

import java.util.List;

import com.myhouse.entity.HouseInfo;
import com.myhouse.entity.SelByName;
import com.myhouse.entity.SelCountByAll;
import com.myhouse.entity.SearchAll;

public interface IHouseInfoOperation {
	public String selHouseTypeNameById(int id);
	public String selDistrictNameById(int id);
	public String selStreetNameById(int id);
	public int addHouse(HouseInfo house);
	public int delHouseById(int delId);
	public boolean selHouseByTitle(String title);
	public boolean selHouseById(int id);
	public HouseInfo selHouseByHD(int id);
	public List<HouseInfo> selAllHouse();
	public List<HouseInfo> selHousesByPage(int pageindex,int pagesize,String key);
	public List<HouseInfo> search
	(SearchAll searchall);
	public List<HouseInfo> selHousesByName(SelByName selbyname);
	public int  UpdateHouse(HouseInfo ht);
	public int selHouseCount(String key);
	public int selHouseCountByAll(SelCountByAll selcountbyall);
	public int selHouseCountByName(String name);
}
