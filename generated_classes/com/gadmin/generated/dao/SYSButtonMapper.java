package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSButton;

public interface SYSButtonMapper {
    int deleteByPrimaryKey(String buttonId);

    int insert(SYSButton record);

    int insertSelective(SYSButton record);

    SYSButton selectByPrimaryKey(String buttonId);

    int updateByPrimaryKeySelective(SYSButton record);

    int updateByPrimaryKey(SYSButton record);
}