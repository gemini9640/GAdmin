package com.gadmin.generated.db;

public class ERPLevel {
    private String LEVEL_ID;

    private String TITLE;

    private String USERNAME;

    public ERPLevel(String LEVEL_ID, String TITLE, String USERNAME) {
        this.LEVEL_ID = LEVEL_ID;
        this.TITLE = TITLE;
        this.USERNAME = USERNAME;
    }

    public ERPLevel() {
        super();
    }

    public String getLEVEL_ID() {
        return LEVEL_ID;
    }

    public void setLEVEL_ID(String LEVEL_ID) {
        this.LEVEL_ID = LEVEL_ID == null ? null : LEVEL_ID.trim();
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE == null ? null : TITLE.trim();
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
        sb.append(", LEVEL_ID=").append(LEVEL_ID);
        sb.append(", TITLE=").append(TITLE);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append("]");
        return sb.toString();
    }
}