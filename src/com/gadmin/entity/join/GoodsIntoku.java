package com.gadmin.entity.join;

import com.gadmin.entity.CPGoods;
import com.gadmin.entity.ERPIntoku;

public class GoodsIntoku {
	private ERPIntoku erpIntoku;
	private CPGoods cpGoods;

	public GoodsIntoku() {
		super();
	}

	public GoodsIntoku(ERPIntoku erpIntoku, CPGoods cpGoods) {
		super();
		this.erpIntoku = erpIntoku;
		this.cpGoods = cpGoods;
	}

	public ERPIntoku getErpIntoku() {
		return erpIntoku;
	}

	public void setErpIntoku(ERPIntoku erpIntoku) {
		this.erpIntoku = erpIntoku;
	}

	public CPGoods getCpGoods() {
		return cpGoods;
	}

	public void setCpGoods(CPGoods cpGoods) {
		this.cpGoods = cpGoods;
	}

	@Override
	public String toString() {
		return "GoodsIntoku [\ncpGoods=" + cpGoods + ", \nerpIntoku="
				+ erpIntoku + "]";
	}

}
