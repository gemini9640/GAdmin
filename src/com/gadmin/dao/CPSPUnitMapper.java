package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.generated.db.CPSPUnit;

public interface CPSPUnitMapper {
    int save(CPSPUnit record);
    
    int deleteById(@Param("SPUNIT_ID")String SPUNIT_ID);
    
    int edit(CPSPUnit record);
    
    CPSPUnit findById(@Param("SPUNIT_ID")String SPUNIT_ID);

    List<CPSPUnit> datalistPage(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME);
    
    List<CPSPUnit> listAllByUsername(@Param("USERNAME")String USERNAME);
    
    int deleteAll(@Param("ids")List ids);
}