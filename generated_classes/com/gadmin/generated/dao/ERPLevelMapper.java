package com.gadmin.generated.dao;

import com.gadmin.generated.db.ERPLevel;

public interface ERPLevelMapper {
    int deleteByPrimaryKey(String LEVEL_ID);

    int insert(ERPLevel record);

    int insertSelective(ERPLevel record);

    ERPLevel selectByPrimaryKey(String LEVEL_ID);

    int updateByPrimaryKeySelective(ERPLevel record);

    int updateByPrimaryKey(ERPLevel record);
}