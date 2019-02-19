package com.gadmin.generated.dao;

import com.gadmin.generated.db.ERPOutku;

public interface ERPOutkuMapper {
    int deleteByPrimaryKey(String OUTKU_ID);

    int insert(ERPOutku record);

    int insertSelective(ERPOutku record);

    ERPOutku selectByPrimaryKey(String OUTKU_ID);

    int updateByPrimaryKeySelective(ERPOutku record);

    int updateByPrimaryKeyWithBLOBs(ERPOutku record);

    int updateByPrimaryKey(ERPOutku record);
}