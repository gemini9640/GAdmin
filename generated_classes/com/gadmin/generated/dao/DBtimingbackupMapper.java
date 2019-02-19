package com.gadmin.generated.dao;

import com.gadmin.generated.db.DBtimingbackup;

public interface DBtimingbackupMapper {
    int deleteByPrimaryKey(String TIMINGBACKUP_ID);

    int insert(DBtimingbackup record);

    int insertSelective(DBtimingbackup record);

    DBtimingbackup selectByPrimaryKey(String TIMINGBACKUP_ID);

    int updateByPrimaryKeySelective(DBtimingbackup record);

    int updateByPrimaryKey(DBtimingbackup record);
}