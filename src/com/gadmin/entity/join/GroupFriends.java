package com.gadmin.entity.join;

import com.gadmin.entity.IMFriends;

public class GroupFriends {
	private IMFriends imFriends;
	private String u_NAME;
	private String g_NAME;
	private String p_PHOTO2;
	public GroupFriends() {
	}
	public GroupFriends(IMFriends imFriends, String u_NAME, String g_NAME,
			String p_PHOTO2) {
		this.imFriends = imFriends;
		this.u_NAME = u_NAME;
		this.g_NAME = g_NAME;
		this.p_PHOTO2 = p_PHOTO2;
	}
	public IMFriends getImFriends() {
		return imFriends;
	}
	public void setImFriends(IMFriends imFriends) {
		this.imFriends = imFriends;
	}
	public String getU_NAME() {
		return u_NAME;
	}
	public void setU_NAME(String u_NAME) {
		this.u_NAME = u_NAME;
	}
	public String getG_NAME() {
		return g_NAME;
	}
	public void setG_NAME(String g_NAME) {
		this.g_NAME = g_NAME;
	}
	public String getP_PHOTO2() {
		return p_PHOTO2;
	}
	public void setP_PHOTO2(String p_PHOTO2) {
		this.p_PHOTO2 = p_PHOTO2;
	}
	@Override
	public String toString() {
		return "GroupFriends [\nimFriends=" + imFriends + ", \nu_NAME=" + u_NAME
				+ ", g_NAME=" + g_NAME + ", p_PHOTO2=" + p_PHOTO2 + "]";
	}
	
	
}
