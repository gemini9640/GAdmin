package com.gadmin.entity.summery;

public class OutkuSalesReport {
	private String GOODS_NAME;
	private Integer count;
	private Double total;

	public OutkuSalesReport() {
	}

	public OutkuSalesReport(String gOODS_NAME, Integer count, Double total) {
		this.GOODS_NAME = gOODS_NAME;
		this.count = count;
		this.total = total;
	}

	public String getGOODS_NAME() {
		return GOODS_NAME;
	}

	public void setGOODS_NAME(String gOODS_NAME) {
		this.GOODS_NAME = gOODS_NAME;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OutkuSalesReport [GOODS_NAME=" + GOODS_NAME + ", count="
				+ count + ", total=" + total + "]";
	}

}
