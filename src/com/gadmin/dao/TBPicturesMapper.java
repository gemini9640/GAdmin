package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.TBPictures;


public interface TBPicturesMapper {
	List<TBPictures> datalistPage(@Param("KEYW")String KEYW, @Param("MASTER_ID")String MASTER_ID);
    
	List<TBPictures> listAll(@Param("GOODS_ID")String GOODS_ID);
	
	int deleteById(@Param("PICTURES_ID")String PICTURES_ID);

    int save(TBPictures record);
    
    TBPictures findById(@Param("PICTURES_ID")String PICTURES_ID);

    int edit(TBPictures record);

    int deleteAllByIds(List ids);
    
    List<TBPictures> getAllById(List ids);
    
    int deleteImgById(@Param("PICTURES_ID")String PICTURES_ID);
    
    Integer findCount(@Param("MASTER_ID")String MASTER_ID);
}