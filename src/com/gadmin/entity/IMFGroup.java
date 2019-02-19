package com.gadmin.entity;

public class IMFGroup {
    private String FGROUP_ID;

    private String NAME;

    private String USERNAME;

    public IMFGroup(String FGROUP_ID, String NAME, String USERNAME) {
        this.FGROUP_ID = FGROUP_ID;
        this.NAME = NAME;
        this.USERNAME = USERNAME;
    }

    public IMFGroup() {
        super();
    }

    public String getFGROUP_ID() {
        return FGROUP_ID;
    }

    public void setFGROUP_ID(String FGROUP_ID) {
        this.FGROUP_ID = FGROUP_ID == null ? null : FGROUP_ID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
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
        sb.append(", FGROUP_ID=").append(FGROUP_ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append("]");
        return sb.toString();
    }
}