package com.gadmin.generated.dao;

import com.gadmin.generated.db.ERPCustomer;

public interface ERPCustomerMapper {
    int deleteByPrimaryKey(String CUSTOMER_ID);

    int insert(ERPCustomer record);

    int insertSelective(ERPCustomer record);

    ERPCustomer selectByPrimaryKey(String CUSTOMER_ID);

    int updateByPrimaryKeySelective(ERPCustomer record);

    int updateByPrimaryKey(ERPCustomer record);
}