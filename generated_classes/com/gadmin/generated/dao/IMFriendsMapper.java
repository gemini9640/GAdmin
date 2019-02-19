package com.gadmin.generated.dao;

import com.gadmin.generated.db.IMFriends;

public interface IMFriendsMapper {
    int deleteByPrimaryKey(String FRIENDS_ID);

    int insert(IMFriends record);

    int insertSelective(IMFriends record);

    IMFriends selectByPrimaryKey(String FRIENDS_ID);

    int updateByPrimaryKeySelective(IMFriends record);

    int updateByPrimaryKey(IMFriends record);
}