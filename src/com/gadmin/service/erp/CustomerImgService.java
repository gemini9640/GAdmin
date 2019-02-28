package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.ERPCustomerimg;

public interface CustomerImgService {
	public void save(ERPCustomerimg img);

	public void deleteById(String CUSTOMERIMG_ID);

	public void edit(ERPCustomerimg img);

	public List<ERPCustomerimg> list(String keywords, String CUSTOMERIMG_ID);

	public List<ERPCustomerimg> listAll();
	
	public ERPCustomerimg findById(String CUSTOMERIMG_ID);

	public void deleteAll(List ids); 
}
