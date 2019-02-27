package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSLog;


public interface SYSLogMapper {
    int deleteById(@Param("LOG_ID")String LOG_ID);

    int save(SYSLog record);

    SYSLog findById(@Param("LOG_ID")String LOG_ID);

    List<SYSLog> datalistPage(@Param("keywords")String keywords, @Param("lastStart")String lastStart, @Param("lastEnd")String lastEnd);

    List<SYSLog> listAll();
    
    int deleteAllByIds(List ids);
}