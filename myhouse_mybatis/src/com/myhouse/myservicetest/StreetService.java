package com.myhouse.myservicetest;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.myhouse.entity.Street;
import com.myhouse.inter.IStreetOperation;

public class StreetService {
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
	public List<Street> selStreet(){
		SqlSession session = sqlSessionFactory.openSession();
		IStreetOperation streetOperation = session.getMapper(IStreetOperation.class);
		//IUserOperation userOperation = session.getMapper(IUserOperation.class);
		return streetOperation.selStreet();
	}
	public Street selStreetById(int id){
		SqlSession session = sqlSessionFactory.openSession();
		IStreetOperation streetOperation = session.getMapper(IStreetOperation.class);
		return streetOperation.selStreetById(id);
	}
}
