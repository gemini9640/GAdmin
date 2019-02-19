package com.gadmin.entity.join;

import com.gadmin.entity.IMFriends;

public class GroupFriendsWithStatus extends GroupFriends {
	private String s_ONLINE;
	private String s_AUTOGRAPH;

	public GroupFriendsWithStatus() {
	}

	public GroupFriendsWithStatus(IMFriends imFriends, String u_NAME,
			String g_NAME, String p_PHOTO2, String s_ONLINE, String s_AUTOGRAPH) {
		super(imFriends, u_NAME, g_NAME, p_PHOTO2);
		this.s_ONLINE = s_ONLINE;
		this.s_AUTOGRAPH = s_AUTOGRAPH;
	}

	public String getS_ONLINE() {
		return s_ONLINE;
	}

	public void setS_ONLINE(String s_ONLINE) {
		this.s_ONLINE = s_ONLINE;
	}

	public String getS_AUTOGRAPH() {
		return s_AUTOGRAPH;
	}

	public void setS_AUTOGRAPH(String s_AUTOGRAPH) {
		this.s_AUTOGRAPH = s_AUTOGRAPH;
	}

	@Override
	public String toString() {
		return super.toString() + "\nGroupFriendsWithStatus [s_ONLINE="
				+ s_ONLINE + ", s_AUTOGRAPH=" + s_AUTOGRAPH + "]";
	}

}
