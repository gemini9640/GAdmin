package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.IMSysmsg;
import com.gadmin.entity.join.UserMsg;

public interface IMSysmsgMapper {
	int deleteById(@Param("SYSMSG_ID") String SYSMSG_ID);

	int save(IMSysmsg record);

	int edit(IMSysmsg record);

	int read(@Param("USERNAME") String USERNAME);

	IMSysmsg findById(@Param("SYSMSG_ID") String SYSMSG_ID);

	Integer getMsgCount(@Param("USERNAME") String USERNAME);

	List<IMSysmsg> datalistPage(@Param("USERNAME") String USERNAME);

	List<UserMsg> listAll(@Param("USERNAME") String USERNAME);

	int deleteAllByIds(List ids);
}