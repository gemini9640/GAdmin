package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.CPSPType;


public interface CPSPTypeMapper {
    int deleteById(@Param("SPTYPE_ID")String SPTYPE_ID);

    int save(CPSPType record);
    
    int edit(CPSPType record);

    CPSPType findById(@Param("SPTYPE_ID")String SPTYPE_ID);
    
    List datalistPage(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME);
    
    List listAllByUsername(@Param("USERNAME")String USERNAME);
    
}