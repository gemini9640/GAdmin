package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSLoginimg;


public interface SYSLoginimgMapper {
    int deleteById(@Param("LOGINIMG_ID")String LOGINIMG_ID);

    int save(SYSLoginimg record);

    int edit(SYSLoginimg record);

    SYSLoginimg findById(@Param("LOGINIMG_ID")String LOGINIMG_ID);

    List<SYSLoginimg> datalistPage(@Param("keywords")String keywords);

    List<SYSLoginimg> listAll();
    
    int deleteAllByIds(List ids);
}
