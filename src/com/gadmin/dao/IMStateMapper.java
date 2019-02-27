package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.IMState;


public interface IMStateMapper {
    int deleteById(@Param("IMSTATE_ID")String IMSTATE_ID);

    int save(IMState record);
    
    int editOnline(IMState record);
    
    int editAuto(IMState record);
    
    int editSign(IMState record);

    IMState findById(@Param("IMSTATE_ID")String IMSTATE_ID);

    IMState findByUsername(@Param("USERNAME")String USERNAME);
    
    List<IMState> datalistPage(@Param("keywords")String keywords);
    
    List<IMState> listAll();
    
    int deleteAllByIds(List ids);
}