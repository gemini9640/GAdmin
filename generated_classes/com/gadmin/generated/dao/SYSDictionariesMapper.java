package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSDictionaries;

public interface SYSDictionariesMapper {
    int deleteByPrimaryKey(String DICTIONARIES_ID);

    int insert(SYSDictionaries record);

    int insertSelective(SYSDictionaries record);

    SYSDictionaries selectByPrimaryKey(String DICTIONARIES_ID);

    int updateByPrimaryKeySelective(SYSDictionaries record);

    int updateByPrimaryKey(SYSDictionaries record);
}