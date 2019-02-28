package com.gadmin.service.erp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gadmin.dao.ERPCustomerimgMapper;
import com.gadmin.entity.ERPCustomerimg;
import com.gadmin.service.erp.CustomerImgService;

@Service("customerImgService")
public class CustomerImgServiceImpl implements CustomerImgService {
	@Autowired
	private ERPCustomerimgMapper erpCustomerimgMapper;

	public void save(ERPCustomerimg img) {
		erpCustomerimgMapper.save(img);
	}

	public void deleteById(String CUSTOMERIMG_ID) {
		erpCustomerimgMapper.deleteById(CUSTOMERIMG_ID);
	}

	public void edit(ERPCustomerimg img) {
		erpCustomerimgMapper.edit(img);
	}

	public List<ERPCustomerimg> list(String keywords, String CUSTOMERIMG_ID) {
		return (List<ERPCustomerimg>) erpCustomerimgMapper.datalistPage(keywords, CUSTOMERIMG_ID);
	}

	public List<ERPCustomerimg> listAll() {
		return (List<ERPCustomerimg>) erpCustomerimgMapper.listAll();
	}
	
	public ERPCustomerimg findById(String CUSTOMERIMG_ID) {
		return erpCustomerimgMapper.findById(CUSTOMERIMG_ID);
	}

	public void deleteAll(List ids) {
		erpCustomerimgMapper.deleteAll(ids);
	}
}
