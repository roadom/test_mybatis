package com.roadom.mybatisWithSpring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.roadom.model.User;

public interface UserDao {
	
	List<User> findAll();
	
	@Insert("insert into user (name, age) values (#{user.name}, #{user.age})")
	void add(@Param("user")User user);
	
	@Delete("delete from user where id = #{id}")
	void delete(Long id);
	
	@Update("update user set name=#{user.name}, age=#{user.age} where id=#{user.id}")
	void udpate(@Param("user")User user);
	
	
}
