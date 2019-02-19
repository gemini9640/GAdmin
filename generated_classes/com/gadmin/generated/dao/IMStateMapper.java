package com.gadmin.generated.dao;

import com.gadmin.generated.db.IMState;

public interface IMStateMapper {
    int deleteByPrimaryKey(String IMSTATE_ID);

    int insert(IMState record);

    int insertSelective(IMState record);

    IMState selectByPrimaryKey(String IMSTATE_ID);

    int updateByPrimaryKeySelective(IMState record);

    int updateByPrimaryKey(IMState record);
}