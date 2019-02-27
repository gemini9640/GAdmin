package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSRole;

public interface SYSRoleMapper {
	List<SYSRole> listAllRolesByPId(@Param("ROLE_ID")String ROLE_ID);
	
	SYSRole findObjectById(@Param("ROLE_ID")String ROLE_ID);

    int save(SYSRole record);

    int edit(SYSRole record);
    
    int deleteRoleById(@Param("ROLE_ID")String ROLE_ID);

    int updateRoleRights(SYSRole record);
    
    SYSRole getRoleById(@Param("ROLE_ID")String ROLE_ID);

    int setAllRights(@Param("rights")String rights, @Param("ROLE_ID")String ROLE_ID);

    int addRole(@Param("value")String value, @Param("ROLE_ID")String ROLE_ID);
    
    int delRole(@Param("value")String value, @Param("ROLE_ID")String ROLE_ID);
    
    int editRole(@Param("value")String value, @Param("ROLE_ID")String ROLE_ID);
    
    int viewRole(@Param("value")String value, @Param("ROLE_ID")String ROLE_ID);
}