package com.gadmin.generated.dao;

import com.gadmin.generated.db.IMIQGroup;

public interface IMIQGroupMapper {
    int deleteByPrimaryKey(String IQGROUP_ID);

    int insert(IMIQGroup record);

    int insertSelective(IMIQGroup record);

    IMIQGroup selectByPrimaryKey(String IQGROUP_ID);

    int updateByPrimaryKeySelective(IMIQGroup record);

    int updateByPrimaryKeyWithBLOBs(IMIQGroup record);

    int updateByPrimaryKey(IMIQGroup record);
}