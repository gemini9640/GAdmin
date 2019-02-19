package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSLoginimg;

public interface SYSLoginimgMapper {
    int deleteByPrimaryKey(String LOGINIMG_ID);

    int insert(SYSLoginimg record);

    int insertSelective(SYSLoginimg record);

    SYSLoginimg selectByPrimaryKey(String LOGINIMG_ID);

    int updateByPrimaryKeySelective(SYSLoginimg record);

    int updateByPrimaryKey(SYSLoginimg record);
}