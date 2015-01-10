package com.roadom.mybatisWithSpring.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.roadom.model.User;
import com.roadom.mybatisWithSpring.biz.UserBiz;


@Controller
public class TestController extends MultiActionController{
	
	@Resource
	private UserBiz userBiz;
	
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response){
		ModelAndView result = new ModelAndView();
		
		List<User> list = userBiz.findAll();
		System.out.println(list);
		
		return result;
	}
	
	public void add(HttpServletRequest request, HttpServletResponse response){
		userBiz.add();
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response){
		userBiz.delete(6L);
	}
	
	public void update(HttpServletRequest request, HttpServletResponse response){
		User user = new User("tommy", 21);
		user.setId(6L);
		
		userBiz.update(user);
	}
}
