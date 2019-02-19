package com.gadmin.dao;

import com.gadmin.generated.db.IMHismsg;

public interface IMHismsgMapper {
    int deleteByPrimaryKey(String hismsgId);

    int insert(IMHismsg record);

    int insertSelective(IMHismsg record);

    IMHismsg selectByPrimaryKey(String hismsgId);

    int updateByPrimaryKeySelective(IMHismsg record);

    int updateByPrimaryKey(IMHismsg record);
}