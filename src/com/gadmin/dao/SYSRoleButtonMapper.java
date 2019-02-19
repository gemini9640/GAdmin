package com.gadmin.dao;

import com.gadmin.generated.db.SYSRoleButton;

public interface SYSRoleButtonMapper {
    int deleteByPrimaryKey(String rbId);

    int insert(SYSRoleButton record);

    int insertSelective(SYSRoleButton record);

    SYSRoleButton selectByPrimaryKey(String rbId);

    int updateByPrimaryKeySelective(SYSRoleButton record);

    int updateByPrimaryKey(SYSRoleButton record);
}