package com.roadom.mybatisWithSpring.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.roadom.model.User;
import com.roadom.mybatisWithSpring.dao.UserDao;

@Service
public class UserBiz {
	
	@Resource
	private UserDao userDao;
	
	public List<User> findAll(){
		return userDao.findAll();
	}

	public User add() {
		User user = new User("Peter", 30);
		userDao.add(user);
		return user;
	}
	
	public void delete(Long id){
		userDao.delete(id);
	}
	
	public void update(User user){
		userDao.udpate(user);
	}

}
