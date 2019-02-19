package com.gadmin.entity.summery;

public class OutkuOrder {
	private String ORDER_NUMBERS;
	private String CUSTOMER_NAME;
	private String CUSTOMER_ID;
	private String OUTDATE;
	private String OUTTIME;
	private Double total;

	public OutkuOrder() {
	}

	public OutkuOrder(String oRDER_NUMBERS, String cUSTOMER_NAME,
			String cUSTOMER_ID, String oUTDATE, String oUTTIME, Double totle) {
		this.ORDER_NUMBERS = oRDER_NUMBERS;
		this.CUSTOMER_NAME = cUSTOMER_NAME;
		this.CUSTOMER_ID = cUSTOMER_ID;
		this.OUTDATE = oUTDATE;
		this.OUTTIME = oUTTIME;
		this.total = total;
	}

	public String getORDER_NUMBERS() {
		return ORDER_NUMBERS;
	}

	public void setORDER_NUMBERS(String oRDER_NUMBERS) {
		ORDER_NUMBERS = oRDER_NUMBERS;
	}

	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}

	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}

	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getOUTDATE() {
		return OUTDATE;
	}

	public void setOUTDATE(String oUTDATE) {
		OUTDATE = oUTDATE;
	}

	public String getOUTTIME() {
		return OUTTIME;
	}

	public void setOUTTIME(String oUTTIME) {
		OUTTIME = oUTTIME;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OutkuOrder [ORDER_NUMBERS=" + ORDER_NUMBERS
				+ ", CUSTOMER_NAME=" + CUSTOMER_NAME + ", CUSTOMER_ID="
				+ CUSTOMER_ID + ", OUTDATE=" + OUTDATE + ", OUTTIME=" + OUTTIME
				+ ", total=" + total + "]";
	}

}
