package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSLog;

public interface SYSLogMapper {
    int deleteByPrimaryKey(String LOG_ID);

    int insert(SYSLog record);

    int insertSelective(SYSLog record);

    SYSLog selectByPrimaryKey(String LOG_ID);

    int updateByPrimaryKeySelective(SYSLog record);

    int updateByPrimaryKey(SYSLog record);
}