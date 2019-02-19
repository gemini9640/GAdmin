package com.gadmin.dao;

import com.gadmin.generated.db.IMState;

public interface IMStateMapper {
    int deleteByPrimaryKey(String imstateId);

    int insert(IMState record);

    int insertSelective(IMState record);

    IMState selectByPrimaryKey(String imstateId);

    int updateByPrimaryKeySelective(IMState record);

    int updateByPrimaryKey(IMState record);
}