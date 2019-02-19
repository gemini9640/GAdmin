package com.gadmin.generated.dao;

import com.gadmin.generated.db.CPSPUnit;

public interface CPSPUnitMapper {
    int deleteByPrimaryKey(String SPUNIT_ID);

    int insert(CPSPUnit record);

    int insertSelective(CPSPUnit record);

    CPSPUnit selectByPrimaryKey(String SPUNIT_ID);

    int updateByPrimaryKeySelective(CPSPUnit record);

    int updateByPrimaryKey(CPSPUnit record);
}