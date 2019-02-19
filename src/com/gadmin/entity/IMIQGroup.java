package com.gadmin.entity;

public class IMIQGroup {
    private String IQGROUP_ID;

    private String USERNAME;

    private String QGROUPS;

    public IMIQGroup(String IQGROUP_ID, String USERNAME, String QGROUPS) {
        this.IQGROUP_ID = IQGROUP_ID;
        this.USERNAME = USERNAME;
        this.QGROUPS = QGROUPS;
    }

    public IMIQGroup() {
        super();
    }

    public String getIQGROUP_ID() {
        return IQGROUP_ID;
    }

    public void setIQGROUP_ID(String IQGROUP_ID) {
        this.IQGROUP_ID = IQGROUP_ID == null ? null : IQGROUP_ID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getQGROUPS() {
        return QGROUPS;
    }

    public void setQGROUPS(String QGROUPS) {
        this.QGROUPS = QGROUPS == null ? null : QGROUPS.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", IQGROUP_ID=").append(IQGROUP_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", QGROUPS=").append(QGROUPS);
        sb.append("]");
        return sb.toString();
    }
}