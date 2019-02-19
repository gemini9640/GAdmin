package com.gadmin.entity;

public class SYSSms {
    private String SMS_ID;

    private String CONTENT;

    private String TYPE;

    private String TO_USERNAME;

    private String FROM_USERNAME;

    private String SEND_TIME;

    private String STATUS;

    private String SANME_ID;

    public SYSSms(String SMS_ID, String CONTENT, String TYPE, String TO_USERNAME, String FROM_USERNAME, String SEND_TIME, String STATUS, String SANME_ID) {
        this.SMS_ID = SMS_ID;
        this.CONTENT = CONTENT;
        this.TYPE = TYPE;
        this.TO_USERNAME = TO_USERNAME;
        this.FROM_USERNAME = FROM_USERNAME;
        this.SEND_TIME = SEND_TIME;
        this.STATUS = STATUS;
        this.SANME_ID = SANME_ID;
    }

    public SYSSms() {
        super();
    }

    public String getSMS_ID() {
        return SMS_ID;
    }

    public void setSMS_ID(String SMS_ID) {
        this.SMS_ID = SMS_ID == null ? null : SMS_ID.trim();
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    public String getTO_USERNAME() {
        return TO_USERNAME;
    }

    public void setTO_USERNAME(String TO_USERNAME) {
        this.TO_USERNAME = TO_USERNAME == null ? null : TO_USERNAME.trim();
    }

    public String getFROM_USERNAME() {
        return FROM_USERNAME;
    }

    public void setFROM_USERNAME(String FROM_USERNAME) {
        this.FROM_USERNAME = FROM_USERNAME == null ? null : FROM_USERNAME.trim();
    }

    public String getSEND_TIME() {
        return SEND_TIME;
    }

    public void setSEND_TIME(String SEND_TIME) {
        this.SEND_TIME = SEND_TIME == null ? null : SEND_TIME.trim();
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    public String getSANME_ID() {
        return SANME_ID;
    }

    public void setSANME_ID(String SANME_ID) {
        this.SANME_ID = SANME_ID == null ? null : SANME_ID.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", SMS_ID=").append(SMS_ID);
        sb.append(", CONTENT=").append(CONTENT);
        sb.append(", TYPE=").append(TYPE);
        sb.append(", TO_USERNAME=").append(TO_USERNAME);
        sb.append(", FROM_USERNAME=").append(FROM_USERNAME);
        sb.append(", SEND_TIME=").append(SEND_TIME);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", SANME_ID=").append(SANME_ID);
        sb.append("]");
        return sb.toString();
    }
}