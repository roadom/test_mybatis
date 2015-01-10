package com.roadom.mybatisWithSpring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.roadom.model.User;

public interface UserDao {
	@Select("SELECT * FROM user")
	public List<User> findAll();
}
