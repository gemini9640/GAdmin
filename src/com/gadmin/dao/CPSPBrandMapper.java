package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.CPSPBrand;


public interface CPSPBrandMapper {
    int deleteById(@Param("SPBRAND_ID")String SPBRAND_ID);

    int save(CPSPBrand record);

    CPSPBrand findById(@Param("SPBRAND_ID")String SPBRAND_ID);

    int edit(CPSPBrand record);
    
    List datalistPage(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME);
    
    List listAllByUsername(@Param("USERNAME")String USERNAME);
    
    int deleteAll(@Param("ids")List ids);
}