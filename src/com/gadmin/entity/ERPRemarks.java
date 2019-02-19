package com.gadmin.entity;

public class ERPRemarks {
    private String REMARKS_ID;

    private String REMARKS;

    private String USERNAME;

    public ERPRemarks(String REMARKS_ID, String REMARKS, String USERNAME) {
        this.REMARKS_ID = REMARKS_ID;
        this.REMARKS = REMARKS;
        this.USERNAME = USERNAME;
    }

    public ERPRemarks() {
        super();
    }

    public String getREMARKS_ID() {
        return REMARKS_ID;
    }

    public void setREMARKS_ID(String REMARKS_ID) {
        this.REMARKS_ID = REMARKS_ID == null ? null : REMARKS_ID.trim();
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS == null ? null : REMARKS.trim();
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
        sb.append(", REMARKS_ID=").append(REMARKS_ID);
        sb.append(", REMARKS=").append(REMARKS);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append("]");
        return sb.toString();
    }
}