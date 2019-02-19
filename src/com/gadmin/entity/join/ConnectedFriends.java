package com.gadmin.entity.join;

public class ConnectedFriends {
	private String f_USERNAME;
	private String u_NAME;
	
	public ConnectedFriends() {
	}

	public ConnectedFriends(String f_USERNAME, String u_NAME) {
		this.f_USERNAME = f_USERNAME;
		this.u_NAME = u_NAME;
	}

	public String getF_USERNAME() {
		return f_USERNAME;
	}

	public void setF_USERNAME(String f_USERNAME) {
		this.f_USERNAME = f_USERNAME;
	}

	public String getU_NAME() {
		return u_NAME;
	}

	public void setU_NAME(String u_NAME) {
		this.u_NAME = u_NAME;
	}

	@Override
	public String toString() {
		return "ConnectedFriends [f_USERNAME=" + f_USERNAME + ", u_NAME="
				+ u_NAME + "]";
	}
	
}
