package com.gadmin.dao;

import com.gadmin.generated.db.DBfhdb;

public interface DBfhdbMapper {
    int deleteByPrimaryKey(String fhdbId);

    int insert(DBfhdb record);

    int insertSelective(DBfhdb record);

    DBfhdb selectByPrimaryKey(String fhdbId);

    int updateByPrimaryKeySelective(DBfhdb record);

    int updateByPrimaryKey(DBfhdb record);
}