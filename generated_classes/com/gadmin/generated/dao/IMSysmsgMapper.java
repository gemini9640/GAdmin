package com.gadmin.generated.dao;

import com.gadmin.generated.db.IMSysmsg;

public interface IMSysmsgMapper {
    int deleteByPrimaryKey(String SYSMSG_ID);

    int insert(IMSysmsg record);

    int insertSelective(IMSysmsg record);

    IMSysmsg selectByPrimaryKey(String SYSMSG_ID);

    int updateByPrimaryKeySelective(IMSysmsg record);

    int updateByPrimaryKey(IMSysmsg record);
}