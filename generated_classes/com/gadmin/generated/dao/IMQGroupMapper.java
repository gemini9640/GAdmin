package com.gadmin.generated.dao;

import com.gadmin.generated.db.IMQGroup;

public interface IMQGroupMapper {
    int deleteByPrimaryKey(String QGROUP_ID);

    int insert(IMQGroup record);

    int insertSelective(IMQGroup record);

    IMQGroup selectByPrimaryKey(String QGROUP_ID);

    int updateByPrimaryKeySelective(IMQGroup record);

    int updateByPrimaryKey(IMQGroup record);
}