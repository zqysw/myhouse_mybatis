package com.myhouse.myservicetest;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.myhouse.entity.FileInfo;
import com.myhouse.inter.IFileInfoOperation;


public class FileInfoService {
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
	public int insertFile(FileInfo fileinfo){
		SqlSession session = sqlSessionFactory.openSession();
		IFileInfoOperation fileinfoOperation = session.getMapper(IFileInfoOperation.class);
		session.close();
		return fileinfoOperation.insertFile(fileinfo);
		
	}
}
