package com.gadmin.generated.db;

public class ERPIntoku {
    private String INTOKU_ID;

    private String GOODS_ID;

    private Integer INCOUNT;

    private Double PRICE;

    private Double ZPRICE;

    private String INTIME;

    private String BZ;

    private String USERNAME;

    private String GOODS_NAME;

    public ERPIntoku(String INTOKU_ID, String GOODS_ID, Integer INCOUNT, Double PRICE, Double ZPRICE, String INTIME, String BZ, String USERNAME, String GOODS_NAME) {
        this.INTOKU_ID = INTOKU_ID;
        this.GOODS_ID = GOODS_ID;
        this.INCOUNT = INCOUNT;
        this.PRICE = PRICE;
        this.ZPRICE = ZPRICE;
        this.INTIME = INTIME;
        this.BZ = BZ;
        this.USERNAME = USERNAME;
        this.GOODS_NAME = GOODS_NAME;
    }

    public ERPIntoku() {
        super();
    }

    public String getINTOKU_ID() {
        return INTOKU_ID;
    }

    public void setINTOKU_ID(String INTOKU_ID) {
        this.INTOKU_ID = INTOKU_ID == null ? null : INTOKU_ID.trim();
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

    public String getINTIME() {
        return INTIME;
    }

    public void setINTIME(String INTIME) {
        this.INTIME = INTIME == null ? null : INTIME.trim();
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ == null ? null : BZ.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getGOODS_NAME() {
        return GOODS_NAME;
    }

    public void setGOODS_NAME(String GOODS_NAME) {
        this.GOODS_NAME = GOODS_NAME == null ? null : GOODS_NAME.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", INTOKU_ID=").append(INTOKU_ID);
        sb.append(", GOODS_ID=").append(GOODS_ID);
        sb.append(", INCOUNT=").append(INCOUNT);
        sb.append(", PRICE=").append(PRICE);
        sb.append(", ZPRICE=").append(ZPRICE);
        sb.append(", INTIME=").append(INTIME);
        sb.append(", BZ=").append(BZ);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", GOODS_NAME=").append(GOODS_NAME);
        sb.append("]");
        return sb.toString();
    }
}