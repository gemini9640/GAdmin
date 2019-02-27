package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.IMIQGroup;
import com.gadmin.entity.join.GroupMembers;
import com.gadmin.entity.join.GroupMembersDetail;


public interface IMIQGroupMapper {
    int deleteByUsername(@Param("USERNAME")String USERNAME);

    int save(IMIQGroup record);
    
    int edit(IMIQGroup record);

    IMIQGroup findByUsername(@Param("USERNAME")String USERNAME);
    
    List<IMIQGroup> findByIdandQid(@Param("USERNAME")String USERNAME, @Param("QGROUP_ID")String QGROUP_ID);
    
    List<IMIQGroup> datalistPage(@Param("keywords")String keywords);
    
    /**
     * 全部群成员带分页
     */
    List<GroupMembers> memberslistPage(@Param("USERNAME")String USERNAME, @Param("QGROUP_ID")String QGROUP_ID, @Param("keywords")String keywords);
    
    List<GroupMembersDetail> listAllByGroupId(@Param("QGROUP_ID")String QGROUP_ID);
}