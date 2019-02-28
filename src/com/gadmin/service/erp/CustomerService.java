package com.gadmin.service.erp;

import java.util.List;

import com.gadmin.entity.ERPCustomer;
import com.gadmin.entity.join.CustomerWithLevel;

public interface CustomerService {
	public void save(ERPCustomer customer);

	public void deleteById(String id);

	public void edit(ERPCustomer customer);

	public List<CustomerWithLevel> list(String keywords, String USERNAME,
			String lastStart, String lastEnd);

	public List<ERPCustomer> listAllByUsernameLoginDate(String USERNAME,
			String days);

	public ERPCustomer findById(String CUSTOMER_ID);

	public void deleteAll(List ids);
}
