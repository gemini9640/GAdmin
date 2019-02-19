package com.gadmin.entity;

public class CPGoods {
    private String GOODS_ID;

    private String TITLE;

    private String BIANMA;

    private String SPTYPE_ID;

    private String SPBRAND_ID;

    private String SPUNIT_ID;

    private String DESCRIPTION;

    private String SHORTDESC;

    private String USERNAME;

    private Integer ZCOUNT;

    public CPGoods(String GOODS_ID, String TITLE, String BIANMA, String SPTYPE_ID, String SPBRAND_ID, String SPUNIT_ID, String DESCRIPTION, String SHORTDESC, String USERNAME, Integer ZCOUNT) {
        this.GOODS_ID = GOODS_ID;
        this.TITLE = TITLE;
        this.BIANMA = BIANMA;
        this.SPTYPE_ID = SPTYPE_ID;
        this.SPBRAND_ID = SPBRAND_ID;
        this.SPUNIT_ID = SPUNIT_ID;
        this.DESCRIPTION = DESCRIPTION;
        this.SHORTDESC = SHORTDESC;
        this.USERNAME = USERNAME;
        this.ZCOUNT = ZCOUNT;
    }

    public CPGoods() {
        super();
    }

    public String getGOODS_ID() {
        return GOODS_ID;
    }

    public void setGOODS_ID(String GOODS_ID) {
        this.GOODS_ID = GOODS_ID == null ? null : GOODS_ID.trim();
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE == null ? null : TITLE.trim();
    }

    public String getBIANMA() {
        return BIANMA;
    }

    public void setBIANMA(String BIANMA) {
        this.BIANMA = BIANMA == null ? null : BIANMA.trim();
    }

    public String getSPTYPE_ID() {
        return SPTYPE_ID;
    }

    public void setSPTYPE_ID(String SPTYPE_ID) {
        this.SPTYPE_ID = SPTYPE_ID == null ? null : SPTYPE_ID.trim();
    }

    public String getSPBRAND_ID() {
        return SPBRAND_ID;
    }

    public void setSPBRAND_ID(String SPBRAND_ID) {
        this.SPBRAND_ID = SPBRAND_ID == null ? null : SPBRAND_ID.trim();
    }

    public String getSPUNIT_ID() {
        return SPUNIT_ID;
    }

    public void setSPUNIT_ID(String SPUNIT_ID) {
        this.SPUNIT_ID = SPUNIT_ID == null ? null : SPUNIT_ID.trim();
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }

    public String getSHORTDESC() {
        return SHORTDESC;
    }

    public void setSHORTDESC(String SHORTDESC) {
        this.SHORTDESC = SHORTDESC == null ? null : SHORTDESC.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public Integer getZCOUNT() {
        return ZCOUNT;
    }

    public void setZCOUNT(Integer ZCOUNT) {
        this.ZCOUNT = ZCOUNT;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", GOODS_ID=").append(GOODS_ID);
        sb.append(", TITLE=").append(TITLE);
        sb.append(", BIANMA=").append(BIANMA);
        sb.append(", SPTYPE_ID=").append(SPTYPE_ID);
        sb.append(", SPBRAND_ID=").append(SPBRAND_ID);
        sb.append(", SPUNIT_ID=").append(SPUNIT_ID);
        sb.append(", DESCRIPTION=").append(DESCRIPTION);
        sb.append(", SHORTDESC=").append(SHORTDESC);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", ZCOUNT=").append(ZCOUNT);
        sb.append("]");
        return sb.toString();
    }
}