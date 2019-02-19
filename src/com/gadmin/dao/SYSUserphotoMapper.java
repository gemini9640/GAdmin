package com.gadmin.dao;

import com.gadmin.generated.db.SYSUserphoto;

public interface SYSUserphotoMapper {
    int deleteByPrimaryKey(String userphotoId);

    int insert(SYSUserphoto record);

    int insertSelective(SYSUserphoto record);

    SYSUserphoto selectByPrimaryKey(String userphotoId);

    int updateByPrimaryKeySelective(SYSUserphoto record);

    int updateByPrimaryKey(SYSUserphoto record);
}