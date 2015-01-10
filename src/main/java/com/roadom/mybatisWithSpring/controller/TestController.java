package com.roadom.mybatisWithSpring.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.roadom.mybatisWithSpring.biz.UserBiz;
import com.roadom.single.User;


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
}
