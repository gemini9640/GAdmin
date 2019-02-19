package com.gadmin.generated.dao;

import com.gadmin.generated.db.TBPictures;

public interface TBPicturesMapper {
    int deleteByPrimaryKey(String PICTURES_ID);

    int insert(TBPictures record);

    int insertSelective(TBPictures record);

    TBPictures selectByPrimaryKey(String PICTURES_ID);

    int updateByPrimaryKeySelective(TBPictures record);

    int updateByPrimaryKey(TBPictures record);
}