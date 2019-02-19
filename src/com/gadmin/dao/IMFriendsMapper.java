package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.IMFriends;
import com.gadmin.entity.join.ConnectedFriends;
import com.gadmin.entity.join.GroupFriends;
import com.gadmin.entity.join.GroupFriendsWithStatus;
import com.gadmin.entity.join.QuickSearchFriends;

public interface IMFriendsMapper {
	int save(IMFriends record);
	
	int deleteById(@Param("FRIENDS_ID")String FRIENDS_ID);

	int pullblack(@Param("USERNAME")String USERNAME, @Param("FUSERNAME")String FUSERNAME);
	
	int edit(IMFriends record);

	int editAllow(IMFriends record);
	
	IMFriends findById(@Param("FRIENDS_ID")String FRIENDS_ID);

	IMFriends findMyFriend(@Param("USERNAME")String USERNAME, @Param("FUSERNAME")String FUSERNAME);
	
	List<GroupFriends> datalistPage(@Param("keywords")String keywords, @Param("lastStart")String lastStart, @Param("lastEnd")String lastEnd, @Param("FGROUP_ID")String FGROUP_ID, @Param("USERNAME")String USERNAME);
	
	List<GroupFriendsWithStatus> listAllWithStatusByUsername(@Param("USERNAME")String USERNAME);
	
	GroupFriendsWithStatus getTheFriend(@Param("USERNAME")String USERNAME, @Param("FUSERNAME")String FUSERNAME);
	
	List<ConnectedFriends> listAllConnectedFriends(@Param("USERNAME")String USERNAME);
	
	List<QuickSearchFriends> listAllToSearch(@Param("keywords")String keywords, @Param("USERNAME")String USERNAME);
	
	int deleteAllByIds(List ids);
}