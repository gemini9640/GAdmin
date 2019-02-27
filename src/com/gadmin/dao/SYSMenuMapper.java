package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSMenu;


public interface SYSMenuMapper {
	List<SYSMenu> listSubMenuByParentId(@Param("parentId")String parentId);
	
	SYSMenu getMenuById(@Param("MENU_ID")Integer MENU_ID);

    int insertMenu(SYSMenu record);
    
    Integer findMaxId();
	
    int deleteMenuById(@Param("MENU_ID")Integer MENU_ID);

    int updateMenu(SYSMenu record);

    int editicon(SYSMenu record);
}