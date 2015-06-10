package com.myhouse.myservicetest;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.myhouse.entity.HouseType;
import com.myhouse.inter.IHouseTypeOperation;
import com.myhouse.inter.IStreetOperation;

public class HouseTypeService {
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
	
	public List<HouseType> selAllType(){
		SqlSession session = sqlSessionFactory.openSession();
		IHouseTypeOperation housetypeOperation = session.getMapper(IHouseTypeOperation.class);
		return housetypeOperation.selAllHouseType();
	}
	public HouseType selHouseTypeById(int id){
		SqlSession session = sqlSessionFactory.openSession();
		IHouseTypeOperation housetypeOperation = session.getMapper(IHouseTypeOperation.class);
		return housetypeOperation.selHouseTypeById(id);
	}
}
