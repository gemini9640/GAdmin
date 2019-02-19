package com.gadmin.generated.dao;

import com.gadmin.generated.db.CPGoods;

public interface CPGoodsMapper {
    int deleteByPrimaryKey(String GOODS_ID);

    int insert(CPGoods record);

    int insertSelective(CPGoods record);

    CPGoods selectByPrimaryKey(String GOODS_ID);

    int updateByPrimaryKeySelective(CPGoods record);

    int updateByPrimaryKey(CPGoods record);
}