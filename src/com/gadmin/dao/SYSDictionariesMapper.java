package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSDictionaries;


public interface SYSDictionariesMapper {
    int deleteById(@Param("DICTIONARIES_ID")String DICTIONARIES_ID);

    int save(SYSDictionaries record);

    int edit(SYSDictionaries record);
    
    SYSDictionaries findById(@Param("DICTIONARIES_ID")String DICTIONARIES_ID);

    SYSDictionaries findByBianma(@Param("BIANMA")String BIANMA);

    List<SYSDictionaries> datalistPage(@Param("DICTIONARIES_ID")String DICTIONARIES_ID, @Param("keywords")String keywords);
    
    List<SYSDictionaries> listSubDictByParentId(@Param("parentId")String parentId);
    
    Integer findFromTbs(@Param("thisTable")String thisTable, @Param("BIANMA")String BIANMA);
}