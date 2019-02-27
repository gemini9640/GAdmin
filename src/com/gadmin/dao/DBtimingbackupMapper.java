package com.gadmin.dao;

import com.gadmin.entity.DBtimingbackup;


public interface DBtimingbackupMapper {
    int deleteByPrimaryKey(String timingbackupId);

    int insert(DBtimingbackup record);

    int insertSelective(DBtimingbackup record);

    DBtimingbackup selectByPrimaryKey(String timingbackupId);

    int updateByPrimaryKeySelective(DBtimingbackup record);

    int updateByPrimaryKey(DBtimingbackup record);
}