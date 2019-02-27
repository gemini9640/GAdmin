package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSLog;
import com.gadmin.entity.SYSRoleButton;


public interface SYSRoleButtonMapper {
    int deleteById(@Param("ROLE_ID")String ROLE_ID, @Param("BUTTON_ID")String BUTTON_ID);

    int save(SYSRoleButton record);

    SYSRoleButton findById(@Param("ROLE_ID")String ROLE_ID, @Param("BUTTON_ID")String BUTTON_ID);

    List<SYSLog> listAll();
    
    List<String> listAllBrAndQxname(@Param("ROLE_ID")String ROLE_ID);
    
}