package com.gadmin.dao;

import com.gadmin.generated.db.SYSLog;

public interface SYSLogMapper {
    int deleteByPrimaryKey(String logId);

    int insert(SYSLog record);

    int insertSelective(SYSLog record);

    SYSLog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(SYSLog record);

    int updateByPrimaryKey(SYSLog record);
}