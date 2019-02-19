package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSUser;

public interface SYSUserMapper {
    int deleteByPrimaryKey(String USER_ID);

    int insert(SYSUser record);

    int insertSelective(SYSUser record);

    SYSUser selectByPrimaryKey(String USER_ID);

    int updateByPrimaryKeySelective(SYSUser record);

    int updateByPrimaryKey(SYSUser record);
}