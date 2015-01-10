package com.roadom.mybatisWithSpring.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.roadom.model.User;
import com.roadom.mybatisWithSpring.dao.UserMapper;

@Service
public class UserBiz {
	
	@Resource
	private UserMapper userMapper;
	
	public List<User> findAll(){
		return userMapper.findAll();
	}

	public User add() {
		User user = new User("Peter", 30);
		userMapper.add(user);
		return user;
	}
	
	public void delete(Long id){
		userMapper.delete(id);
	}
	
	public void update(User user){
		userMapper.udpate(user);
	}

}
