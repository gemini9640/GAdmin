package com.gadmin.entity.join;

public class GroupMembersDetail {
	private String f_USERNAME;
	private String u_NAME;
	private String p_PHOTO2;
	private String  f_QGROUPS;
	private String  s_ONLINE;
	private String  s_AUTOGRAPH;
	
	public GroupMembersDetail() {
	}

	public GroupMembersDetail(String f_USERNAME, String u_NAME,
			String p_PHOTO2, String f_QGROUPS, String s_ONLINE,
			String s_AUTOGRAPH) {
		super();
		this.f_USERNAME = f_USERNAME;
		this.u_NAME = u_NAME;
		this.p_PHOTO2 = p_PHOTO2;
		this.f_QGROUPS = f_QGROUPS;
		this.s_ONLINE = s_ONLINE;
		this.s_AUTOGRAPH = s_AUTOGRAPH;
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

	public String getF_QGROUPS() {
		return f_QGROUPS;
	}

	public void setF_QGROUPS(String f_QGROUPS) {
		this.f_QGROUPS = f_QGROUPS;
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


}
