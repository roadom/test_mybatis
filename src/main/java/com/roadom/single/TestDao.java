package com.roadom.single;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.roadom.model.User;

public class TestDao {
	
	List<User> findAll(){
		List<User> result = new ArrayList<User>();
		SqlSession sqlSession = null;
		try {
			sqlSession = DBAccess.getSqlSession();
			result = sqlSession.selectList("User.findAll");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=sqlSession){
				sqlSession.close();
			}
		}
		
		return result;
	}
	
	
	
	@Test
	public void testName() throws Exception {
		TestDao dao = new TestDao();
		List<User> a = dao.findAll();
		
		System.out.println(a);
	}
	
}
