package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.ERPRemarks;

public interface ERPRemarksMapper {
	int save(ERPRemarks record);

	int deleteById(@Param("REMARKS_ID") String REMARKS_ID);

	int edit(ERPRemarks record);

	ERPRemarks findById(@Param("REMARKS_ID") String REMARKS_ID);

	List<ERPRemarks> datalistPage(@Param("keywords") String keywords,
			@Param("USERNAME") String USERNAME);

	List<ERPRemarks> listAllByUsername(@Param("USERNAME") String USERNAME);

	int deleteAllByIds(List ids);
}