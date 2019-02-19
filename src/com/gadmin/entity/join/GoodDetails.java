package com.gadmin.entity.join;

import com.gadmin.entity.CPGoods;
import com.gadmin.entity.CPSPBrand;
import com.gadmin.entity.CPSPType;
import com.gadmin.entity.CPSPUnit;

public class GoodDetails {
	private CPGoods cpGoods;
	private CPSPBrand cpspBrand;
	private CPSPType cpspType;
	private CPSPUnit cpspUnit;
	
	
	public GoodDetails() {
		super();
	}


	public GoodDetails(CPGoods cpGoods, CPSPBrand cpspBrand, CPSPType cpspType,
			CPSPUnit cpspUnit) {
		super();
		this.cpGoods = cpGoods;
		this.cpspBrand = cpspBrand;
		this.cpspType = cpspType;
		this.cpspUnit = cpspUnit;
	}


	public CPGoods getCpGoods() {
		return cpGoods;
	}


	public void setCpGoods(CPGoods cpGoods) {
		this.cpGoods = cpGoods;
	}


	public CPSPBrand getCpspBrand() {
		return cpspBrand;
	}


	public void setCpspBrand(CPSPBrand cpspBrand) {
		this.cpspBrand = cpspBrand;
	}


	public CPSPType getCpspType() {
		return cpspType;
	}


	public void setCpspType(CPSPType cpspType) {
		this.cpspType = cpspType;
	}


	public CPSPUnit getCpspUnit() {
		return cpspUnit;
	}


	public void setCpspUnit(CPSPUnit cpspUnit) {
		this.cpspUnit = cpspUnit;
	}


	@Override
	public String toString() {
		return "GoodDetails [\ncpGoods=" + cpGoods + ", \ncpspBrand=" + cpspBrand
				+ ", \ncpspType=" + cpspType + ", \ncpspUnit=" + cpspUnit + "]";
	}
	
	
}
