package com.roadom.single;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class DBAccess {
	
	public static SqlSession getSqlSession() throws IOException{
		//通过配置文件获取数据库信息
		Reader reader = Resources.getResourceAsReader("Configuration.xml");
		//通过配置信息构建一个sqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		//通过sqlSessionFactory打开一个数据库会话
		SqlSession session = factory.openSession();
		
		return session;
	}
	
	@Test
	public void testName() throws Exception {
		getSqlSession();
	}
	
}
