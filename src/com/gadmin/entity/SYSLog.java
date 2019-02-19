package com.gadmin.entity;

public class SYSLog {
    private String LOG_ID;

    private String USERNAME;

    private String CZTIME;

    private String CONTENT;

    public SYSLog(String LOG_ID, String USERNAME, String CZTIME, String CONTENT) {
        this.LOG_ID = LOG_ID;
        this.USERNAME = USERNAME;
        this.CZTIME = CZTIME;
        this.CONTENT = CONTENT;
    }

    public SYSLog() {
        super();
    }

    public String getLOG_ID() {
        return LOG_ID;
    }

    public void setLOG_ID(String LOG_ID) {
        this.LOG_ID = LOG_ID == null ? null : LOG_ID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getCZTIME() {
        return CZTIME;
    }

    public void setCZTIME(String CZTIME) {
        this.CZTIME = CZTIME == null ? null : CZTIME.trim();
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", LOG_ID=").append(LOG_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", CZTIME=").append(CZTIME);
        sb.append(", CONTENT=").append(CONTENT);
        sb.append("]");
        return sb.toString();
    }
}