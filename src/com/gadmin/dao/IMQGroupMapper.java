package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.IMQGroup;


public interface IMQGroupMapper {
    int deleteById(@Param("QGROUP_ID")String QGROUP_ID);

    int save(IMQGroup record);

    int delImgById(@Param("QGROUP_ID")String QGROUP_ID);

    int edit(IMQGroup record);
    
    IMQGroup findById(@Param("QGROUP_ID")String QGROUP_ID);

    List<IMQGroup> datalistPage(@Param("keywords")String keywords, @Param("item")String item);

    List<IMQGroup> mylistAll(@Param("item")String item);
    
    List<IMQGroup> searchListAll(@Param("keywords")String keywords);
    
    List<IMQGroup> listAll();
}