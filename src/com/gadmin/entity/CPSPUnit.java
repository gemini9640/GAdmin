package com.gadmin.entity;

public class CPSPUnit {
    private String SPUNIT_ID;

    private String NAME;

    private String BZ;

    private String USERNAME;

    public CPSPUnit(String SPUNIT_ID, String NAME, String BZ, String USERNAME) {
        this.SPUNIT_ID = SPUNIT_ID;
        this.NAME = NAME;
        this.BZ = BZ;
        this.USERNAME = USERNAME;
    }

    public CPSPUnit() {
        super();
    }

    public String getSPUNIT_ID() {
        return SPUNIT_ID;
    }

    public void setSPUNIT_ID(String SPUNIT_ID) {
        this.SPUNIT_ID = SPUNIT_ID == null ? null : SPUNIT_ID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", SPUNIT_ID=").append(SPUNIT_ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", BZ=").append(BZ);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append("]");
        return sb.toString();
    }
}