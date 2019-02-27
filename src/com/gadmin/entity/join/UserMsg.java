package com.gadmin.entity.join;

import com.gadmin.entity.IMSysmsg;

public class UserMsg {
	private IMSysmsg imSysmsg;
	private String s_AUTOGRAPH;
	private String p_PHOTO2;
	private String u_NAME;
	public UserMsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserMsg(IMSysmsg imSysmsg, String s_AUTOGRAPH, String p_PHOTO2,
			String u_NAME) {
		super();
		this.imSysmsg = imSysmsg;
		this.s_AUTOGRAPH = s_AUTOGRAPH;
		this.p_PHOTO2 = p_PHOTO2;
		this.u_NAME = u_NAME;
	}
	public IMSysmsg getImSysmsg() {
		return imSysmsg;
	}
	public void setImSysmsg(IMSysmsg imSysmsg) {
		this.imSysmsg = imSysmsg;
	}
	public String getS_AUTOGRAPH() {
		return s_AUTOGRAPH;
	}
	public void setS_AUTOGRAPH(String s_AUTOGRAPH) {
		this.s_AUTOGRAPH = s_AUTOGRAPH;
	}
	public String getP_PHOTO2() {
		return p_PHOTO2;
	}
	public void setP_PHOTO2(String p_PHOTO2) {
		this.p_PHOTO2 = p_PHOTO2;
	}
	public String getU_NAME() {
		return u_NAME;
	}
	public void setU_NAME(String u_NAME) {
		this.u_NAME = u_NAME;
	}
	@Override
	public String toString() {
		return "UserMsg [imSysmsg=" + imSysmsg + ", \ns_AUTOGRAPH=" + s_AUTOGRAPH
				+ ", p_PHOTO2=" + p_PHOTO2 + ", u_NAME=" + u_NAME + "]";
	}
	
	
}
