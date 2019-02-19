package com.gadmin.generated.dao;

import com.gadmin.generated.db.DBfhdb;

public interface DBfhdbMapper {
    int deleteByPrimaryKey(String FHDB_ID);

    int insert(DBfhdb record);

    int insertSelective(DBfhdb record);

    DBfhdb selectByPrimaryKey(String FHDB_ID);

    int updateByPrimaryKeySelective(DBfhdb record);

    int updateByPrimaryKey(DBfhdb record);
}