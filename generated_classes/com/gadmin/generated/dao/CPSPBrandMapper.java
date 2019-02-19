package com.gadmin.generated.dao;

import com.gadmin.generated.db.CPSPBrand;

public interface CPSPBrandMapper {
    int deleteByPrimaryKey(String SPBRAND_ID);

    int insert(CPSPBrand record);

    int insertSelective(CPSPBrand record);

    CPSPBrand selectByPrimaryKey(String SPBRAND_ID);

    int updateByPrimaryKeySelective(CPSPBrand record);

    int updateByPrimaryKey(CPSPBrand record);
}