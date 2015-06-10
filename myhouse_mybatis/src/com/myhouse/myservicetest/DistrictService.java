package com.myhouse.myservicetest;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.myhouse.entity.District;
import com.myhouse.inter.IDistrictOperation;
import com.myhouse.inter.IStreetOperation;

public class DistrictService {
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

		public List<District> selDistrict(){
			SqlSession session = sqlSessionFactory.openSession();
			IDistrictOperation districtOperation = session.getMapper(IDistrictOperation.class);
			return districtOperation.selAllDistrict();
			
		}
		public District selDistrictById(int id){
			SqlSession session = sqlSessionFactory.openSession();
			IDistrictOperation districtOperation = session.getMapper(IDistrictOperation.class);
			return districtOperation.selDistrictById(id);
		}
}
