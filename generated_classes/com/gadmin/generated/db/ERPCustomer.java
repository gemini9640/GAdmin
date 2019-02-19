package com.gadmin.generated.db;

public class ERPCustomer {
    private String CUSTOMER_ID;

    private String NAME;

    private String AGE;

    private String PHONE;

    private String ADDRESS;

    private String QQ;

    private String WEIXIN;

    private String CTIME;

    private Integer MONEY;

    private String LEVEL;

    private String REMARKS1;

    private String REMARKS2;

    private String USERNAME;

    public ERPCustomer(String CUSTOMER_ID, String NAME, String AGE, String PHONE, String ADDRESS, String QQ, String WEIXIN, String CTIME, Integer MONEY, String LEVEL, String REMARKS1, String REMARKS2, String USERNAME) {
        this.CUSTOMER_ID = CUSTOMER_ID;
        this.NAME = NAME;
        this.AGE = AGE;
        this.PHONE = PHONE;
        this.ADDRESS = ADDRESS;
        this.QQ = QQ;
        this.WEIXIN = WEIXIN;
        this.CTIME = CTIME;
        this.MONEY = MONEY;
        this.LEVEL = LEVEL;
        this.REMARKS1 = REMARKS1;
        this.REMARKS2 = REMARKS2;
        this.USERNAME = USERNAME;
    }

    public ERPCustomer() {
        super();
    }

    public String getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public void setCUSTOMER_ID(String CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID == null ? null : CUSTOMER_ID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getAGE() {
        return AGE;
    }

    public void setAGE(String AGE) {
        this.AGE = AGE == null ? null : AGE.trim();
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE == null ? null : PHONE.trim();
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS == null ? null : ADDRESS.trim();
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ == null ? null : QQ.trim();
    }

    public String getWEIXIN() {
        return WEIXIN;
    }

    public void setWEIXIN(String WEIXIN) {
        this.WEIXIN = WEIXIN == null ? null : WEIXIN.trim();
    }

    public String getCTIME() {
        return CTIME;
    }

    public void setCTIME(String CTIME) {
        this.CTIME = CTIME == null ? null : CTIME.trim();
    }

    public Integer getMONEY() {
        return MONEY;
    }

    public void setMONEY(Integer MONEY) {
        this.MONEY = MONEY;
    }

    public String getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(String LEVEL) {
        this.LEVEL = LEVEL == null ? null : LEVEL.trim();
    }

    public String getREMARKS1() {
        return REMARKS1;
    }

    public void setREMARKS1(String REMARKS1) {
        this.REMARKS1 = REMARKS1 == null ? null : REMARKS1.trim();
    }

    public String getREMARKS2() {
        return REMARKS2;
    }

    public void setREMARKS2(String REMARKS2) {
        this.REMARKS2 = REMARKS2 == null ? null : REMARKS2.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", CUSTOMER_ID=").append(CUSTOMER_ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", AGE=").append(AGE);
        sb.append(", PHONE=").append(PHONE);
        sb.append(", ADDRESS=").append(ADDRESS);
        sb.append(", QQ=").append(QQ);
        sb.append(", WEIXIN=").append(WEIXIN);
        sb.append(", CTIME=").append(CTIME);
        sb.append(", MONEY=").append(MONEY);
        sb.append(", LEVEL=").append(LEVEL);
        sb.append(", REMARKS1=").append(REMARKS1);
        sb.append(", REMARKS2=").append(REMARKS2);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append("]");
        return sb.toString();
    }
}