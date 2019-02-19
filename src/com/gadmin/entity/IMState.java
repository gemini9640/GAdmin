package com.gadmin.entity;

public class IMState {
    private String IMSTATE_ID;

    private String USERNAME;

    private String ONLINE;

    private String AUTOGRAPH;

    private String SIGN;

    public IMState(String IMSTATE_ID, String USERNAME, String ONLINE, String AUTOGRAPH, String SIGN) {
        this.IMSTATE_ID = IMSTATE_ID;
        this.USERNAME = USERNAME;
        this.ONLINE = ONLINE;
        this.AUTOGRAPH = AUTOGRAPH;
        this.SIGN = SIGN;
    }

    public IMState() {
        super();
    }

    public String getIMSTATE_ID() {
        return IMSTATE_ID;
    }

    public void setIMSTATE_ID(String IMSTATE_ID) {
        this.IMSTATE_ID = IMSTATE_ID == null ? null : IMSTATE_ID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getONLINE() {
        return ONLINE;
    }

    public void setONLINE(String ONLINE) {
        this.ONLINE = ONLINE == null ? null : ONLINE.trim();
    }

    public String getAUTOGRAPH() {
        return AUTOGRAPH;
    }

    public void setAUTOGRAPH(String AUTOGRAPH) {
        this.AUTOGRAPH = AUTOGRAPH == null ? null : AUTOGRAPH.trim();
    }

    public String getSIGN() {
        return SIGN;
    }

    public void setSIGN(String SIGN) {
        this.SIGN = SIGN == null ? null : SIGN.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", IMSTATE_ID=").append(IMSTATE_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", ONLINE=").append(ONLINE);
        sb.append(", AUTOGRAPH=").append(AUTOGRAPH);
        sb.append(", SIGN=").append(SIGN);
        sb.append("]");
        return sb.toString();
    }
}