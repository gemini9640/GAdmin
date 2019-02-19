package com.gadmin.entity;

public class SYSDictionaries {
    private String DICTIONARIES_ID;

    private String NAME;

    private String NAME_EN;

    private String BIANMA;

    private Integer ORDER_BY;

    private String PARENT_ID;

    private String BZ;

    private String TBSNAME;

    public SYSDictionaries(String DICTIONARIES_ID, String NAME, String NAME_EN, String BIANMA, Integer ORDER_BY, String PARENT_ID, String BZ, String TBSNAME) {
        this.DICTIONARIES_ID = DICTIONARIES_ID;
        this.NAME = NAME;
        this.NAME_EN = NAME_EN;
        this.BIANMA = BIANMA;
        this.ORDER_BY = ORDER_BY;
        this.PARENT_ID = PARENT_ID;
        this.BZ = BZ;
        this.TBSNAME = TBSNAME;
    }

    public SYSDictionaries() {
        super();
    }

    public String getDICTIONARIES_ID() {
        return DICTIONARIES_ID;
    }

    public void setDICTIONARIES_ID(String DICTIONARIES_ID) {
        this.DICTIONARIES_ID = DICTIONARIES_ID == null ? null : DICTIONARIES_ID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getNAME_EN() {
        return NAME_EN;
    }

    public void setNAME_EN(String NAME_EN) {
        this.NAME_EN = NAME_EN == null ? null : NAME_EN.trim();
    }

    public String getBIANMA() {
        return BIANMA;
    }

    public void setBIANMA(String BIANMA) {
        this.BIANMA = BIANMA == null ? null : BIANMA.trim();
    }

    public Integer getORDER_BY() {
        return ORDER_BY;
    }

    public void setORDER_BY(Integer ORDER_BY) {
        this.ORDER_BY = ORDER_BY;
    }

    public String getPARENT_ID() {
        return PARENT_ID;
    }

    public void setPARENT_ID(String PARENT_ID) {
        this.PARENT_ID = PARENT_ID == null ? null : PARENT_ID.trim();
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ == null ? null : BZ.trim();
    }

    public String getTBSNAME() {
        return TBSNAME;
    }

    public void setTBSNAME(String TBSNAME) {
        this.TBSNAME = TBSNAME == null ? null : TBSNAME.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", DICTIONARIES_ID=").append(DICTIONARIES_ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", NAME_EN=").append(NAME_EN);
        sb.append(", BIANMA=").append(BIANMA);
        sb.append(", ORDER_BY=").append(ORDER_BY);
        sb.append(", PARENT_ID=").append(PARENT_ID);
        sb.append(", BZ=").append(BZ);
        sb.append(", TBSNAME=").append(TBSNAME);
        sb.append("]");
        return sb.toString();
    }
}