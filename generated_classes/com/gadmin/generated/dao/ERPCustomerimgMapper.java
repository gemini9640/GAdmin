package com.gadmin.generated.dao;

import com.gadmin.generated.db.ERPCustomerimg;

public interface ERPCustomerimgMapper {
    int deleteByPrimaryKey(String CUSTOMERIMG_ID);

    int insert(ERPCustomerimg record);

    int insertSelective(ERPCustomerimg record);

    ERPCustomerimg selectByPrimaryKey(String CUSTOMERIMG_ID);

    int updateByPrimaryKeySelective(ERPCustomerimg record);

    int updateByPrimaryKey(ERPCustomerimg record);
}