package com.gadmin.dao;

import com.gadmin.generated.db.SYSLoginimg;

public interface SYSLoginimgMapper {
    int deleteByPrimaryKey(String loginimgId);

    int insert(SYSLoginimg record);

    int insertSelective(SYSLoginimg record);

    SYSLoginimg selectByPrimaryKey(String loginimgId);

    int updateByPrimaryKeySelective(SYSLoginimg record);

    int updateByPrimaryKey(SYSLoginimg record);
}