package com.gadmin.dao;

import com.gadmin.generated.db.SYSDictionaries;

public interface SYSDictionariesMapper {
    int deleteByPrimaryKey(String dictionariesId);

    int insert(SYSDictionaries record);

    int insertSelective(SYSDictionaries record);

    SYSDictionaries selectByPrimaryKey(String dictionariesId);

    int updateByPrimaryKeySelective(SYSDictionaries record);

    int updateByPrimaryKey(SYSDictionaries record);
}