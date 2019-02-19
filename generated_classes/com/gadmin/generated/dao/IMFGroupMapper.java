package com.gadmin.generated.dao;

import com.gadmin.generated.db.IMFGroup;

public interface IMFGroupMapper {
    int deleteByPrimaryKey(String FGROUP_ID);

    int insert(IMFGroup record);

    int insertSelective(IMFGroup record);

    IMFGroup selectByPrimaryKey(String FGROUP_ID);

    int updateByPrimaryKeySelective(IMFGroup record);

    int updateByPrimaryKey(IMFGroup record);
}