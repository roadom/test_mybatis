package com.roadom.mybatisWithSpring.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.roadom.model.Customer;
import com.roadom.mybatisWithSpring.dao.CustomerDao;

@Service
public class CustomerBiz {
	
	@Resource
	private CustomerDao customerDao;
	
	public List<Customer> findAll(){
		return customerDao.findAll();
	}

}
