package com.gadmin.generated.dao;

import com.gadmin.generated.db.IMHismsg;

public interface IMHismsgMapper {
    int deleteByPrimaryKey(String HISMSG_ID);

    int insert(IMHismsg record);

    int insertSelective(IMHismsg record);

    IMHismsg selectByPrimaryKey(String HISMSG_ID);

    int updateByPrimaryKeySelective(IMHismsg record);

    int updateByPrimaryKey(IMHismsg record);
}