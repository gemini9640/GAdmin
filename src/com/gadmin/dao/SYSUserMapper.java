package com.gadmin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gadmin.entity.SYSUser;
import com.gadmin.entity.join.UserAndRole;


public interface SYSUserMapper {
	
	SYSUser getUserInfo(@Param("USER_ID")String USER_ID, @Param("USERNAME")String USERNAME, @Param("PASSWORD")String PASSWORD);
	
	int updateLastLogin(@Param("USER_ID")String USER_ID, @Param("LAST_LOGIN")String LAST_LOGIN);
	
	int saveSkin(@Param("SKIN")String SKIN, @Param("USERNAME")String USERNAME);
	
	UserAndRole getUserAndRoleById(@Param("USER_ID")String USER_ID);
	
	SYSUser findByUsername(@Param("USERNAME")String USERNAME);
	
	int saveIP(@Param("USERNAME")String USERNAME,  @Param("IP")String IP);
	
	List<SYSUser> listAllUserByRoldId(@Param("ROLE_ID")String ROLE_ID);
	
	List<UserAndRole> userlistPage(@Param("keywords")String keywords, @Param("ROLE_ID")String ROLE_ID, @Param("lastLoginStart")String lastLoginStart, @Param("lastLoginEnd")String lastLoginEnd);
	
//	List userBystafflistPage(@Param("keywords")String keywords, @Param("ROLE_ID")String ROLE_ID, @Param("lastLoginStart")String lastLoginStart, @Param("lastLoginEnd")String lastLoginEnd);
	
	List<SYSUser> findByUserEmail(@Param("EMAIL")String EMAIL ,@Param("USERNAME")String USERNAME);
	
	List<SYSUser> findByUserNumber(@Param("NUMBER")String NUMBER ,@Param("USERNAME")String USERNAME);
	
	SYSUser findById(@Param("USER_ID")String USER_ID);
	
	int saveUser(SYSUser record);
	
	int editUser(SYSUser record);
	
	int deleteById(@Param("USER_ID")String USER_ID);
	
	List<UserAndRole> listAllUser(@Param("keywords")String keywords, @Param("ROLE_ID")String ROLE_ID, @Param("lastLoginStart")String lastLoginStart, @Param("lastLoginEnd")String lastLoginEnd);
	
	int getUserCount();
}