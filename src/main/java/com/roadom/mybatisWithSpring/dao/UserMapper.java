package com.roadom.mybatisWithSpring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.roadom.model.User;

public interface UserMapper {
	
	@Select("SELECT * FROM user")
	List<User> findAll();
	
	@Insert("insert into user (name, age) values (#{user.name}, #{user.age})")
	public void add(@Param("user")User user);
	
	@Delete("delete from user where id = #{id}")
	public void delete(Long id);
	
	@Update("update user set name=#{user.name}, age=#{user.age} where id=#{user.id}")
	public void udpate(@Param("user")User user);
}
