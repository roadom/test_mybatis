package com.roadom.mybatisWithSpring.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.roadom.mybatisWithSpring.dao.UserMapper;
import com.roadom.single.User;

@Service
public class UserBiz {
	
	@Resource
	private UserMapper userMapper;
	
	public List<User> findAll(){
		return userMapper.findAll();
	}

}
