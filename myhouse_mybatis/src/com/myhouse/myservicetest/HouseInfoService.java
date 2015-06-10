package com.myhouse.myservicetest;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.myhouse.entity.HouseInfo;
import com.myhouse.entity.SearchAll;
import com.myhouse.entity.SelByName;
import com.myhouse.entity.SelCountByAll;
import com.myhouse.inter.IHouseInfoOperation;
import com.myhouse.inter.IHouseTypeOperation;

public class HouseInfoService {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("conf.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}
	public int addHouse(HouseInfo house) {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		int result = -2;
		boolean istrue = housetypeOperation.selHouseByTitle(house.getTitle());
		if (istrue == false) {
			result = housetypeOperation.addHouse(house);
		} else {
			result = -1;
		}
		session.close();
		return result;
	}
	/**
	 * 删除某条信息。
	 * @param id是要删除的信息的id
	 * @return
	 */
	public int delHouse(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		int result = -2;
		boolean istrue = housetypeOperation.selHouseById(id);
		if (istrue == true) {
		
			result = housetypeOperation.delHouseById(id);
		
		} else {
			result = -1;
		}
		session.close();
		return result;
	}
	public List<HouseInfo> selAllHouse() {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.selAllHouse();
	}
	public List<HouseInfo> selHousesByPage(int pageindex,int pagesize) {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.selHousesByPage(pageindex, pagesize,"");
	}
	public List<HouseInfo> selHousesByKey(int pageindex,int pagesize,String key) {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.selHousesByPage(pageindex, pagesize, key);
	}

	public List<HouseInfo> search(SearchAll searchall) {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.search(searchall);
	}
	public List<HouseInfo> selHousesByName(SelByName selbyname) {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.selHousesByName(selbyname);
	}
	public String selHouseTypeById(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.selHouseTypeNameById(id);
	}

	public String selDistrictTypeById(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.selDistrictNameById(id);
	}

	public String selStreetTypeById(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.selStreetNameById(id);
	}
	public int getPageCount(int pagesize){
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		int count = -1;
		int housecount = housetypeOperation.selHouseCount("");
		if(housecount%pagesize ==0){
			count = housecount/pagesize;
		}else{
			count =  housecount/pagesize+1;
		}
		return count;
		
	}
	public int getPageCountByKey(int pagesize,String key){
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		int count = -1;
		int housecount = housetypeOperation.selHouseCount(key);
		if(housecount%pagesize ==0){
			count = housecount/pagesize;
		}else{
			count =  housecount/pagesize+1;
		}
		return count;
	}
	/**
	 * 根据所有条件搜索房子数量
	 * @param pagesize
	 * @param key
	 * @return
	 */
	public int getPageCountByAll(int pagesize,SelCountByAll selcountbyall){
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		int count = -1;
		int housecount = housetypeOperation.selHouseCountByAll(selcountbyall);
		if(housecount%pagesize ==0){
		
			count = housecount/pagesize;
		}else{
			count = housecount/pagesize+1;
		}
		return count;	
	}
	public int getPageCountByName(int pagesize, String name){
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		int count = -1;
		int housecount = housetypeOperation.selHouseCountByName(name);
		if(housecount%pagesize ==0){
			count = housecount/pagesize;
		}else{
			count =  housecount/pagesize+1;
		}
		return count;
	}
	public int editHouse(HouseInfo house){
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.UpdateHouse(house);
	}
	public HouseInfo selHouseByID(int id){
		SqlSession session = sqlSessionFactory.openSession();
		IHouseInfoOperation housetypeOperation = session.getMapper(IHouseInfoOperation.class);
		return housetypeOperation.selHouseByHD(id);
	}
}
