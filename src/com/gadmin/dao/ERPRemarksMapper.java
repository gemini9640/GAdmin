package com.gadmin.dao;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.ERPRemarks;


public interface ERPRemarksMapper {
    int save(ERPRemarks record);
    
    int deleteById(@Param("REMARKS_ID")String REMARKS_ID);

    int edit(ERPRemarks record);

    ERPRemarks findById(@Param("REMARKS_ID")String REMARKS_ID);

    int updateByPrimaryKeySelective(ERPRemarks record);

    int updateByPrimaryKey(ERPRemarks record);
}