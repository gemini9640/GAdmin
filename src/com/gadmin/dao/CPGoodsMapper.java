package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.CPGoods;
import com.gadmin.entity.join.GoodDetails;


public interface CPGoodsMapper {
	int save(CPGoods record);
	
	int deleteById(@Param("GOODS_ID")String GOODS_ID);
	
	int edit(CPGoods record);
	
	int editInstockById(@Param("GOODS_ID")String GOODS_ID, @Param("ZCOUNT")Integer ZCOUNT);
	
	CPGoods findById(@Param("GOODS_ID")String GOODS_ID);
	
	GoodDetails findDetailsById(@Param("GOODS_ID")String GOODS_ID);
	
	List<GoodDetails> dataListPage(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME, @Param("SPBRAND_ID")String SPBRAND_ID, @Param("SPTYPE_ID")String SPTYPE_ID, @Param("isInstock")String isInstock);
	
	List<GoodDetails> listAllByUsername(@Param("USERNAME")String USERNAME);
	
	List<GoodDetails> listByUsernameAndBianma(@Param("USERNAME")String USERNAME, @Param("BIANMA")String BIANMA);
	
	int deleteAllByIds(List ids);
	
	int addInstockById(@Param("GOODS_ID")String GOODS_ID, @Param("addCount")Integer addCount);
}