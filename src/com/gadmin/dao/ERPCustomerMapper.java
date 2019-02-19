package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.ERPCustomer;
import com.gadmin.entity.join.CustomerWithLevel;


public interface ERPCustomerMapper {
    int save(ERPCustomer record);
    
    int deleteById(@Param("CUSTOMER_ID")String CUSTOMER_ID);

    int edit(ERPCustomer record);

    ERPCustomer findById(@Param("CUSTOMER_ID")String CUSTOMER_ID);

    List<CustomerWithLevel> datalistPage(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME, @Param("lastStart")String lastStart, @Param("lastEnd")String lastEnd);
    
    //days 选填
    List<ERPCustomer> listAllByUsernameLoginDate(@Param("USERNAME")String USERNAME, @Param("days")String days);
    
    int deleteAll(@Param("ids")List ids);
}