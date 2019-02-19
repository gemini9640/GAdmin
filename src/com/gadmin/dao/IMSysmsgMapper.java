package com.gadmin.dao;

import com.gadmin.generated.db.IMSysmsg;

public interface IMSysmsgMapper {
    int deleteByPrimaryKey(String sysmsgId);

    int insert(IMSysmsg record);

    int insertSelective(IMSysmsg record);

    IMSysmsg selectByPrimaryKey(String sysmsgId);

    int updateByPrimaryKeySelective(IMSysmsg record);

    int updateByPrimaryKey(IMSysmsg record);
}