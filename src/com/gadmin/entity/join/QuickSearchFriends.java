package com.gadmin.entity.join;

public class QuickSearchFriends {
	private String u_NAME;
	private String u_USERNAME;
	private String p_PHOTO1;
	private String p_PHOTO2;

	public QuickSearchFriends() {
	}

	public QuickSearchFriends(String u_NAME, String u_USERNAME,
			String p_PHOTO1, String p_PHOTO2) {
		this.u_NAME = u_NAME;
		this.u_USERNAME = u_USERNAME;
		this.p_PHOTO1 = p_PHOTO1;
		this.p_PHOTO2 = p_PHOTO2;
	}

	public String getU_NAME() {
		return u_NAME;
	}

	public void setU_NAME(String u_NAME) {
		this.u_NAME = u_NAME;
	}

	public String getU_USERNAME() {
		return u_USERNAME;
	}

	public void setU_USERNAME(String u_USERNAME) {
		this.u_USERNAME = u_USERNAME;
	}

	public String getP_PHOTO1() {
		return p_PHOTO1;
	}

	public void setP_PHOTO1(String p_PHOTO1) {
		this.p_PHOTO1 = p_PHOTO1;
	}

	public String getP_PHOTO2() {
		return p_PHOTO2;
	}

	public void setP_PHOTO2(String p_PHOTO2) {
		this.p_PHOTO2 = p_PHOTO2;
	}

	@Override
	public String toString() {
		return "QuickSearchFriends [u_NAME=" + u_NAME + ", u_USERNAME="
				+ u_USERNAME + ", p_PHOTO1=" + p_PHOTO1 + ", p_PHOTO2="
				+ p_PHOTO2 + "]";
	}

}
