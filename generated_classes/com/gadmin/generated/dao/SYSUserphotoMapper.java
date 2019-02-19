package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSUserphoto;

public interface SYSUserphotoMapper {
    int deleteByPrimaryKey(String USERPHOTO_ID);

    int insert(SYSUserphoto record);

    int insertSelective(SYSUserphoto record);

    SYSUserphoto selectByPrimaryKey(String USERPHOTO_ID);

    int updateByPrimaryKeySelective(SYSUserphoto record);

    int updateByPrimaryKey(SYSUserphoto record);
}