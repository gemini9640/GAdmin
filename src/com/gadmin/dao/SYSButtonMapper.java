package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSButton;


public interface SYSButtonMapper {
    int deleteById(@Param("BUTTON_ID")String BUTTON_ID);

    int save(SYSButton record);
    
    int edit(SYSButton record);

    SYSButton findById(@Param("BUTTON_ID")String BUTTON_ID);

    List<SYSButton> datalistPage(@Param("keywords")String keywords);
    
    List<SYSButton> listAll();
    
    int deleteAllByIds(List ids);
}