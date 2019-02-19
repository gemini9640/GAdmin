package com.gadmin.generated.db;

public class CPSPType {
    private String SPTYPE_ID;

    private String NAME;

    private String BZ;

    private String USERNAME;

    public CPSPType(String SPTYPE_ID, String NAME, String BZ, String USERNAME) {
        this.SPTYPE_ID = SPTYPE_ID;
        this.NAME = NAME;
        this.BZ = BZ;
        this.USERNAME = USERNAME;
    }

    public CPSPType() {
        super();
    }

    public String getSPTYPE_ID() {
        return SPTYPE_ID;
    }

    public void setSPTYPE_ID(String SPTYPE_ID) {
        this.SPTYPE_ID = SPTYPE_ID == null ? null : SPTYPE_ID.trim();
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
        sb.append(", SPTYPE_ID=").append(SPTYPE_ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", BZ=").append(BZ);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append("]");
        return sb.toString();
    }
}