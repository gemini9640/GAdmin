package com.gadmin.generated.dao;

import com.gadmin.generated.db.SYSMenu;

public interface SYSMenuMapper {
    int deleteByPrimaryKey(Integer MENU_ID);

    int insert(SYSMenu record);

    int insertSelective(SYSMenu record);

    SYSMenu selectByPrimaryKey(Integer MENU_ID);

    int updateByPrimaryKeySelective(SYSMenu record);

    int updateByPrimaryKey(SYSMenu record);
}