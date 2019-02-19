package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.IMFGroup;


public interface IMFGroupMapper {
	int save(IMFGroup record);
	
    int deleteById(@Param("FGROUP_ID")String FGROUP_ID);

    int edit(IMFGroup record);

    IMFGroup findById(@Param("FGROUP_ID")String FGROUP_ID);
    
    List<IMFGroup> datalistPage(@Param("USERNAME")String USERNAME);

    List<IMFGroup> listAllByUsername(@Param("USERNAME")String USERNAME);

    int deleteAllByIds(List ids);
}