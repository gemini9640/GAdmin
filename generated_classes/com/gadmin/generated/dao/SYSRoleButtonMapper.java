package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSRoleButton;

public interface SYSRoleButtonMapper {
    int deleteByPrimaryKey(String RB_ID);

    int insert(SYSRoleButton record);

    int insertSelective(SYSRoleButton record);

    SYSRoleButton selectByPrimaryKey(String RB_ID);

    int updateByPrimaryKeySelective(SYSRoleButton record);

    int updateByPrimaryKey(SYSRoleButton record);
}