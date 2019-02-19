package com.gadmin.generated.dao;

import com.gadmin.generated.db.ERPIntoku;

public interface ERPIntokuMapper {
    int deleteByPrimaryKey(String INTOKU_ID);

    int insert(ERPIntoku record);

    int insertSelective(ERPIntoku record);

    ERPIntoku selectByPrimaryKey(String INTOKU_ID);

    int updateByPrimaryKeySelective(ERPIntoku record);

    int updateByPrimaryKey(ERPIntoku record);
}