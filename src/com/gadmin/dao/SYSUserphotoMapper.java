package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSUserphoto;


public interface SYSUserphotoMapper {
    int deleteById(@Param("USERPHOTO_ID")String USERPHOTO_ID);

    int save(SYSUserphoto record);
    
    int edit(SYSUserphoto record);

    SYSUserphoto findByUsername(@Param("USERNAME")String USERNAME);

    List<SYSUserphoto> datalistPage(@Param("keywords")String keywords);
    
    List<SYSUserphoto> listAll();
    
    int deleteAllByIds(List ids);
}