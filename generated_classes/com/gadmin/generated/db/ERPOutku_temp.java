package com.gadmin.generated.db;

public class ERPOutku_temp {
    private String OUTKU_ID;

    private String GOODS_ID;

    private Integer INCOUNT;

    private Double PRICE;

    private Double ZPRICE;

    private String OUTTIME;

    private String GOODS_NAME;

    private String USERNAME;

    private String CUSTOMER_ID;

    private String CUSTOMER_NAME;

    private String ORDER_NUMBER;

    private String ORDER_NUMBERS;

    private String OUTDATE;

    private String BZ;

    public ERPOutku_temp(String OUTKU_ID, String GOODS_ID, Integer INCOUNT, Double PRICE, Double ZPRICE, String OUTTIME, String GOODS_NAME, String USERNAME, String CUSTOMER_ID, String CUSTOMER_NAME, String ORDER_NUMBER, String ORDER_NUMBERS, String OUTDATE, String BZ) {
        this.OUTKU_ID = OUTKU_ID;
        this.GOODS_ID = GOODS_ID;
        this.INCOUNT = INCOUNT;
        this.PRICE = PRICE;
        this.ZPRICE = ZPRICE;
        this.OUTTIME = OUTTIME;
        this.GOODS_NAME = GOODS_NAME;
        this.USERNAME = USERNAME;
        this.CUSTOMER_ID = CUSTOMER_ID;
        this.CUSTOMER_NAME = CUSTOMER_NAME;
        this.ORDER_NUMBER = ORDER_NUMBER;
        this.ORDER_NUMBERS = ORDER_NUMBERS;
        this.OUTDATE = OUTDATE;
        this.BZ = BZ;
    }

    public ERPOutku_temp() {
        super();
    }

    public String getOUTKU_ID() {
        return OUTKU_ID;
    }

    public void setOUTKU_ID(String OUTKU_ID) {
        this.OUTKU_ID = OUTKU_ID == null ? null : OUTKU_ID.trim();
    }

    public String getGOODS_ID() {
        return GOODS_ID;
    }

    public void setGOODS_ID(String GOODS_ID) {
        this.GOODS_ID = GOODS_ID == null ? null : GOODS_ID.trim();
    }

    public Integer getINCOUNT() {
        return INCOUNT;
    }

    public void setINCOUNT(Integer INCOUNT) {
        this.INCOUNT = INCOUNT;
    }

    public Double getPRICE() {
        return PRICE;
    }

    public void setPRICE(Double PRICE) {
        this.PRICE = PRICE;
    }

    public Double getZPRICE() {
        return ZPRICE;
    }

    public void setZPRICE(Double ZPRICE) {
        this.ZPRICE = ZPRICE;
    }

    public String getOUTTIME() {
        return OUTTIME;
    }

    public void setOUTTIME(String OUTTIME) {
        this.OUTTIME = OUTTIME == null ? null : OUTTIME.trim();
    }

    public String getGOODS_NAME() {
        return GOODS_NAME;
    }

    public void setGOODS_NAME(String GOODS_NAME) {
        this.GOODS_NAME = GOODS_NAME == null ? null : GOODS_NAME.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public void setCUSTOMER_ID(String CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID == null ? null : CUSTOMER_ID.trim();
    }

    public String getCUSTOMER_NAME() {
        return CUSTOMER_NAME;
    }

    public void setCUSTOMER_NAME(String CUSTOMER_NAME) {
        this.CUSTOMER_NAME = CUSTOMER_NAME == null ? null : CUSTOMER_NAME.trim();
    }

    public String getORDER_NUMBER() {
        return ORDER_NUMBER;
    }

    public void setORDER_NUMBER(String ORDER_NUMBER) {
        this.ORDER_NUMBER = ORDER_NUMBER == null ? null : ORDER_NUMBER.trim();
    }

    public String getORDER_NUMBERS() {
        return ORDER_NUMBERS;
    }

    public void setORDER_NUMBERS(String ORDER_NUMBERS) {
        this.ORDER_NUMBERS = ORDER_NUMBERS == null ? null : ORDER_NUMBERS.trim();
    }

    public String getOUTDATE() {
        return OUTDATE;
    }

    public void setOUTDATE(String OUTDATE) {
        this.OUTDATE = OUTDATE == null ? null : OUTDATE.trim();
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ == null ? null : BZ.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", OUTKU_ID=").append(OUTKU_ID);
        sb.append(", GOODS_ID=").append(GOODS_ID);
        sb.append(", INCOUNT=").append(INCOUNT);
        sb.append(", PRICE=").append(PRICE);
        sb.append(", ZPRICE=").append(ZPRICE);
        sb.append(", OUTTIME=").append(OUTTIME);
        sb.append(", GOODS_NAME=").append(GOODS_NAME);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", CUSTOMER_ID=").append(CUSTOMER_ID);
        sb.append(", CUSTOMER_NAME=").append(CUSTOMER_NAME);
        sb.append(", ORDER_NUMBER=").append(ORDER_NUMBER);
        sb.append(", ORDER_NUMBERS=").append(ORDER_NUMBERS);
        sb.append(", OUTDATE=").append(OUTDATE);
        sb.append(", BZ=").append(BZ);
        sb.append("]");
        return sb.toString();
    }
}