package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.ERPCustomerimg;


public interface ERPCustomerimgMapper {
    int save(ERPCustomerimg record);
    
    int deleteById(@Param("CUSTOMERIMG_ID")String CUSTOMERIMG_ID);
    
    int edit(ERPCustomerimg record);
    
    ERPCustomerimg findById(@Param("CUSTOMERIMG_ID")String CUSTOMERIMG_ID);

    List listAll();
    
    int deleteAll(@Param("ids")List ids);
    
    
    
}