package com.gadmin.entity.join;

public class GroupMembers {
	private String f_USERNAME;
	private String u_NAME;
	private String p_PHOTO2;

	public GroupMembers() {
	}

	public GroupMembers(String f_USERNAME, String u_NAME, String p_PHOTO2) {
		super();
		this.f_USERNAME = f_USERNAME;
		this.u_NAME = u_NAME;
		this.p_PHOTO2 = p_PHOTO2;
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

	public String getP_PHOTO2() {
		return p_PHOTO2;
	}

	public void setP_PHOTO2(String p_PHOTO2) {
		this.p_PHOTO2 = p_PHOTO2;
	}

	@Override
	public String toString() {
		return "GroupMembers [f_USERNAME=" + f_USERNAME + ", u_NAME=" + u_NAME
				+ ", p_PHOTO2=" + p_PHOTO2 + "]";
	}

}
