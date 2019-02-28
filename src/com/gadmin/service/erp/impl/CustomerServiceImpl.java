package com.gadmin.service.erp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.ERPCustomerMapper;
import com.gadmin.entity.ERPCustomer;
import com.gadmin.entity.join.CustomerWithLevel;
import com.gadmin.service.erp.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private ERPCustomerMapper erpCustomerMapper;
	
	public void save(ERPCustomer customer) {
		erpCustomerMapper.save(customer);
	}

	public void deleteById(String id) {
		erpCustomerMapper.deleteById(id);
	}

	public void edit(ERPCustomer customer) {
		erpCustomerMapper.edit(customer);
	}
	
	public List<CustomerWithLevel> list(String keywords, String USERNAME, String lastStart, String lastEnd) {
		return (List<CustomerWithLevel>) erpCustomerMapper.datalistPage(keywords, USERNAME, lastStart, lastEnd);
	}
	
	public List<ERPCustomer> listAllByUsernameLoginDate(String USERNAME, String days) {
		return (List<ERPCustomer>) erpCustomerMapper.listAllByUsernameLoginDate(USERNAME, days);
	}
	
	public ERPCustomer findById(String CUSTOMER_ID) {
		return erpCustomerMapper.findById(CUSTOMER_ID);
	}

	public void deleteAll(List ids) {
		erpCustomerMapper.deleteAll(ids);
	}
	
}
