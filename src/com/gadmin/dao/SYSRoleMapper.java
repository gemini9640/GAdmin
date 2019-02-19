package com.gadmin.dao;

import com.gadmin.generated.db.SYSRole;

public interface SYSRoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(SYSRole record);

    int insertSelective(SYSRole record);

    SYSRole selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(SYSRole record);

    int updateByPrimaryKey(SYSRole record);
}