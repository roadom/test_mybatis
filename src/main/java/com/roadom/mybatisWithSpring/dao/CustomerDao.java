package com.roadom.mybatisWithSpring.dao;

import java.util.List;

import com.roadom.model.Customer;

public interface CustomerDao {

	List<Customer> findAll();
}
