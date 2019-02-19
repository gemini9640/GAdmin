package com.gadmin.dao;

import com.gadmin.generated.db.IMFGroup;

public interface IMFGroupMapper {
    int deleteByPrimaryKey(String fgroupId);

    int insert(IMFGroup record);

    int insertSelective(IMFGroup record);

    IMFGroup selectByPrimaryKey(String fgroupId);

    int updateByPrimaryKeySelective(IMFGroup record);

    int updateByPrimaryKey(IMFGroup record);
}