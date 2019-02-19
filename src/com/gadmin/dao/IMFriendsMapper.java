package com.gadmin.dao;

import com.gadmin.generated.db.IMFriends;

public interface IMFriendsMapper {
    int deleteByPrimaryKey(String friendsId);

    int insert(IMFriends record);

    int insertSelective(IMFriends record);

    IMFriends selectByPrimaryKey(String friendsId);

    int updateByPrimaryKeySelective(IMFriends record);

    int updateByPrimaryKey(IMFriends record);
}