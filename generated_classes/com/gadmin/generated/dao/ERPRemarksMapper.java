package com.gadmin.generated.dao;

import com.gadmin.generated.db.ERPRemarks;

public interface ERPRemarksMapper {
    int deleteByPrimaryKey(String REMARKS_ID);

    int insert(ERPRemarks record);

    int insertSelective(ERPRemarks record);

    ERPRemarks selectByPrimaryKey(String REMARKS_ID);

    int updateByPrimaryKeySelective(ERPRemarks record);

    int updateByPrimaryKey(ERPRemarks record);
}