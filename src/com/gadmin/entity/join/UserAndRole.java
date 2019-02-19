package com.gadmin.entity.join;

import com.gadmin.entity.SYSRole;
import com.gadmin.entity.SYSUser;

public class UserAndRole {
	private SYSUser sysUser;
	private SYSRole sysRole;
	
	public UserAndRole() {
	}

	public UserAndRole(SYSUser sysUser, SYSRole sysRole) {
		super();
		this.sysUser = sysUser;
		this.sysRole = sysRole;
	}

	public SYSUser getSysUser() {
		return sysUser;
	}

	public void setSysUser(SYSUser sysUser) {
		this.sysUser = sysUser;
	}

	public SYSRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SYSRole sysRole) {
		this.sysRole = sysRole;
	}

	@Override
	public String toString() {
		return "UserAndRole [\nsysUser=" + sysUser + ", \nsysRole=" + sysRole + "]";
	}
	
}
