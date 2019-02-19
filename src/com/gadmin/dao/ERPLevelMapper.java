package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.ERPLevel;


public interface ERPLevelMapper {
    int save(ERPLevel record);
    
    int deleteById(@Param("LEVEL_ID")String LEVEL_ID);

    int edit(ERPLevel record);

    ERPLevel findById(@Param("LEVEL_ID")String LEVEL_ID);

    List<ERPLevel> dataListPage(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME);
    
    List<ERPLevel> listAllById(@Param("LEVEL_ID")String LEVEL_ID);
    
    int deleteAllByIds(List ids);
}