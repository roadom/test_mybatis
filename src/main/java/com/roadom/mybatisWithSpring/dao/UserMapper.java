package com.roadom.mybatisWithSpring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.roadom.single.User;

public interface UserMapper {
	
	@Select("SELECT * FROM user")
	List<User> findAll();
}
