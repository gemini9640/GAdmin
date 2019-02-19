package com.gadmin.generated.dao;

import com.gadmin.generated.db.CPSPType;

public interface CPSPTypeMapper {
    int deleteByPrimaryKey(String SPTYPE_ID);

    int insert(CPSPType record);

    int insertSelective(CPSPType record);

    CPSPType selectByPrimaryKey(String SPTYPE_ID);

    int updateByPrimaryKeySelective(CPSPType record);

    int updateByPrimaryKey(CPSPType record);
}