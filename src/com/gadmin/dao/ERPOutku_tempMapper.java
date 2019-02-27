package com.gadmin.dao;

import com.gadmin.entity.ERPOutku_temp;


public interface ERPOutku_tempMapper {
    int deleteByPrimaryKey(String outkuId);

    int insert(ERPOutku_temp record);

    int insertSelective(ERPOutku_temp record);

    ERPOutku_temp selectByPrimaryKey(String outkuId);

    int updateByPrimaryKeySelective(ERPOutku_temp record);

    int updateByPrimaryKeyWithBLOBs(ERPOutku_temp record);

    int updateByPrimaryKey(ERPOutku_temp record);
}