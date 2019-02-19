package com.gadmin.dao;

import com.gadmin.generated.db.TBPictures;

public interface TBPicturesMapper {
    int deleteByPrimaryKey(String picturesId);

    int insert(TBPictures record);

    int insertSelective(TBPictures record);

    TBPictures selectByPrimaryKey(String picturesId);

    int updateByPrimaryKeySelective(TBPictures record);

    int updateByPrimaryKey(TBPictures record);
}