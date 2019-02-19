package com.gadmin.dao;

import com.gadmin.generated.db.IMQGroup;

public interface IMQGroupMapper {
    int deleteByPrimaryKey(String qgroupId);

    int insert(IMQGroup record);

    int insertSelective(IMQGroup record);

    IMQGroup selectByPrimaryKey(String qgroupId);

    int updateByPrimaryKeySelective(IMQGroup record);

    int updateByPrimaryKey(IMQGroup record);
}