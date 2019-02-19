package com.gadmin.generated.db;

public class IMQGroup {
    private String QGROUP_ID;

    private String NAME;

    private String USERNAME;

    private String PHOTO;

    private String CTIME;

    public IMQGroup(String QGROUP_ID, String NAME, String USERNAME, String PHOTO, String CTIME) {
        this.QGROUP_ID = QGROUP_ID;
        this.NAME = NAME;
        this.USERNAME = USERNAME;
        this.PHOTO = PHOTO;
        this.CTIME = CTIME;
    }

    public IMQGroup() {
        super();
    }

    public String getQGROUP_ID() {
        return QGROUP_ID;
    }

    public void setQGROUP_ID(String QGROUP_ID) {
        this.QGROUP_ID = QGROUP_ID == null ? null : QGROUP_ID.trim();
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

    public String getPHOTO() {
        return PHOTO;
    }

    public void setPHOTO(String PHOTO) {
        this.PHOTO = PHOTO == null ? null : PHOTO.trim();
    }

    public String getCTIME() {
        return CTIME;
    }

    public void setCTIME(String CTIME) {
        this.CTIME = CTIME == null ? null : CTIME.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", QGROUP_ID=").append(QGROUP_ID);
        sb.append(", NAME=").append(NAME);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", PHOTO=").append(PHOTO);
        sb.append(", CTIME=").append(CTIME);
        sb.append("]");
        return sb.toString();
    }
}