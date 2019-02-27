package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.IMHismsg;


public interface IMHismsgMapper {
    int deleteById(@Param("HISMSG_ID")String HISMSG_ID);

    int save(IMHismsg record);

    IMHismsg findById(@Param("HISMSG_ID")String HISMSG_ID);

    int editByUsername(@Param("USERNAME")String USERNAME);

    List<IMHismsg> datalistPage(@Param("USERNAME")String  USERNAME, @Param("TOID")String  TOID);
    
    List<IMHismsg> listAllnoread(@Param("USERNAME")String USERNAME);
    
    List<IMHismsg> listAll();
    
    int deleteAllByIds(List ids);
}