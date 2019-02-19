package com.gadmin.dao;

import com.gadmin.generated.db.IMIQGroup;

public interface IMIQGroupMapper {
    int deleteByPrimaryKey(String iqgroupId);

    int insert(IMIQGroup record);

    int insertSelective(IMIQGroup record);

    IMIQGroup selectByPrimaryKey(String iqgroupId);

    int updateByPrimaryKeySelective(IMIQGroup record);

    int updateByPrimaryKeyWithBLOBs(IMIQGroup record);

    int updateByPrimaryKey(IMIQGroup record);
}