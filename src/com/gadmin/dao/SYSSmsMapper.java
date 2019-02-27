package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSSms;


public interface SYSSmsMapper {
    int deleteById(@Param("SMS_ID")String SMS_ID);

    int save(SYSSms record);

    int edit(SYSSms record);

    SYSSms findById(@Param("SMS_ID")String SMS_ID);

    List<SYSSms> datalistPage(@Param("keywords")String keywords, @Param("FROM_USERNAME")String FROM_USERNAME, @Param("TYPE")String TYPE, @Param("lastLoginStart")String lastLoginStart, @Param("lastLoginEnd")String lastLoginEnd, @Param("STATUS")String STATUS);

    List<SYSSms> listAll();
    
    Integer findsmsCount(@Param("SMS_ID")String SMS_ID, @Param("USERNAME")String USERNAME);
    
    int deleteAllByIds(List ids);
}