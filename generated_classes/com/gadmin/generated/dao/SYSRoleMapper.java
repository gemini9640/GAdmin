package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSRole;

public interface SYSRoleMapper {
    int deleteByPrimaryKey(String ROLE_ID);

    int insert(SYSRole record);

    int insertSelective(SYSRole record);

    SYSRole selectByPrimaryKey(String ROLE_ID);

    int updateByPrimaryKeySelective(SYSRole record);

    int updateByPrimaryKey(SYSRole record);
}