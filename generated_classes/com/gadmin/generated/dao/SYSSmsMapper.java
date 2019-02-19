package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSSms;

public interface SYSSmsMapper {
    int deleteByPrimaryKey(String SMS_ID);

    int insert(SYSSms record);

    int insertSelective(SYSSms record);

    SYSSms selectByPrimaryKey(String SMS_ID);

    int updateByPrimaryKeySelective(SYSSms record);

    int updateByPrimaryKey(SYSSms record);
}