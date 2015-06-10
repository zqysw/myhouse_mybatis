package com.myhouse.myservicetest;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.myhouse.inter.IUserOperation;
import com.myhouse.entity.User;

public class UserService {
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
	public int addUser(User us){
		int result = -2;
		 SqlSession session = sqlSessionFactory.openSession();
	        try {
	            IUserOperation userOperation=session.getMapper(IUserOperation.class);
	            result =  userOperation.addUser(us);
	            session.commit();
	           
	        } finally {
	            session.close();
	        }
		return result;
	}
	public User getUser(String name){
		SqlSession session = sqlSessionFactory.openSession();
		IUserOperation userOperation = session.getMapper(IUserOperation.class);
		return userOperation.selUserByName(name);

	}
	public boolean selUserIsTrue(String name) {
		SqlSession session = sqlSessionFactory.openSession();
		IUserOperation userOperation = session.getMapper(IUserOperation.class);
		boolean result = userOperation.selUserIsTrue(name);
		return result;
	}
	public boolean selUser(User user) {
	SqlSession session = sqlSessionFactory.openSession();
	IUserOperation userOperation = session.getMapper(IUserOperation.class);
		User us1 = userOperation.selUserByName(user.getName());
		if (us1 != null) {
			if (us1.getPassword().equals(user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}else{
			return false;
		}
	}
	
}
