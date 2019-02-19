package com.gadmin.dao;

import com.gadmin.generated.db.SYSMenu;

public interface SYSMenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(SYSMenu record);

    int insertSelective(SYSMenu record);

    SYSMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(SYSMenu record);

    int updateByPrimaryKey(SYSMenu record);
}