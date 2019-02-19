package com.gadmin.dao;

import com.gadmin.generated.db.SYSSms;

public interface SYSSmsMapper {
    int deleteByPrimaryKey(String smsId);

    int insert(SYSSms record);

    int insertSelective(SYSSms record);

    SYSSms selectByPrimaryKey(String smsId);

    int updateByPrimaryKeySelective(SYSSms record);

    int updateByPrimaryKey(SYSSms record);
}