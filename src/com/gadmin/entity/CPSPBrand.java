package com.gadmin.entity;

public class CPSPBrand {
    private String SPBRAND_ID;

    private String NAME;

    private String BZ;

    private String USERNAME;

    public CPSPBrand(String SPBRAND_ID, String NAME, String BZ, String USERNAME) {
        this.SPBRAND_ID = SPBRAND_ID;
        this.NAME = NAME;
        this.BZ = BZ;
        this.USERNAME = USERNAME;
    }

    public CPSPBrand() {
        super();
    }

    public String getSPBRAND_ID() {
        return SPBRAND_ID;
    }

    public void setSPBRAND_ID(String SPBRAND_ID) {
        this.SPBRAND_ID = SPBRAND_ID == null ? null : SPBRAND_ID.trim();
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
        sb.append(", SPBRAND_ID=").append(SPBRAND_ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", BZ=").append(BZ);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append("]");
        return sb.toString();
    }
}