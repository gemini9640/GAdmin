package com.gadmin.entity.join;

import com.gadmin.entity.ERPCustomer;
import com.gadmin.entity.ERPLevel;

public class CustomerWithLevel {
	private ERPCustomer erpCustomer;
	private ERPLevel erpLevel;
	public CustomerWithLevel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerWithLevel(ERPCustomer erpCustomer, ERPLevel erpLevel) {
		super();
		this.erpCustomer = erpCustomer;
		this.erpLevel = erpLevel;
	}
	public ERPCustomer getErpCustomer() {
		return erpCustomer;
	}
	public void setErpCustomer(ERPCustomer erpCustomer) {
		this.erpCustomer = erpCustomer;
	}
	public ERPLevel getErpLevel() {
		return erpLevel;
	}
	public void setErpLevel(ERPLevel erpLevel) {
		this.erpLevel = erpLevel;
	}
	@Override
	public String toString() {
		return "CustomerWithLevel [\nerpCustomer=" + erpCustomer + ", \nerpLevel="
				+ erpLevel + "]";
	}
	
}
