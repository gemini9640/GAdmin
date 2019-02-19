package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.ERPIntoku;
import com.gadmin.entity.join.GoodsIntoku;


public interface ERPIntokuMapper {
    int save(ERPIntoku record);
    
    int deleteById(@Param("INTOKU_ID")String INTOKU_ID);

    int edit(ERPIntoku record);
    
    ERPIntoku findById(@Param("INTOKU_ID")String INTOKU_ID);

    List<GoodsIntoku> dataListPage(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME, @Param("lastStart")String lastStart, @Param("lastEnd")String lastEnd);

    Double priceSum(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME, @Param("lastStart")String lastStart, @Param("lastEnd")String lastEnd);
    
    List<ERPIntoku> listAllByUsername(@Param("USERNAME")String USERNAME);
    
    int deleteAllByIds(List ids);
}