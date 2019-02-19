package com.gadmin.generated.dao;

import com.gadmin.generated.db.ERPOutku_temp;

public interface ERPOutku_tempMapper {
    int deleteByPrimaryKey(String OUTKU_ID);

    int insert(ERPOutku_temp record);

    int insertSelective(ERPOutku_temp record);

    ERPOutku_temp selectByPrimaryKey(String OUTKU_ID);

    int updateByPrimaryKeySelective(ERPOutku_temp record);

    int updateByPrimaryKeyWithBLOBs(ERPOutku_temp record);

    int updateByPrimaryKey(ERPOutku_temp record);
}