package com.gadmin.generated.db;

public class IMHismsg {
    private String HISMSG_ID;

    private String USERNAME;

    private String TOID;

    private String TYPE;

    private String NAME;

    private String PHOTO;

    private String CTIME;

    private String CONTENT;

    private String DREAD;

    private String OWNER;

    public IMHismsg(String HISMSG_ID, String USERNAME, String TOID, String TYPE, String NAME, String PHOTO, String CTIME, String CONTENT, String DREAD, String OWNER) {
        this.HISMSG_ID = HISMSG_ID;
        this.USERNAME = USERNAME;
        this.TOID = TOID;
        this.TYPE = TYPE;
        this.NAME = NAME;
        this.PHOTO = PHOTO;
        this.CTIME = CTIME;
        this.CONTENT = CONTENT;
        this.DREAD = DREAD;
        this.OWNER = OWNER;
    }

    public IMHismsg() {
        super();
    }

    public String getHISMSG_ID() {
        return HISMSG_ID;
    }

    public void setHISMSG_ID(String HISMSG_ID) {
        this.HISMSG_ID = HISMSG_ID == null ? null : HISMSG_ID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getTOID() {
        return TOID;
    }

    public void setTOID(String TOID) {
        this.TOID = TOID == null ? null : TOID.trim();
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
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

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }

    public String getDREAD() {
        return DREAD;
    }

    public void setDREAD(String DREAD) {
        this.DREAD = DREAD == null ? null : DREAD.trim();
    }

    public String getOWNER() {
        return OWNER;
    }

    public void setOWNER(String OWNER) {
        this.OWNER = OWNER == null ? null : OWNER.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", HISMSG_ID=").append(HISMSG_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", TOID=").append(TOID);
        sb.append(", TYPE=").append(TYPE);
        sb.append(", NAME=").append(NAME);
        sb.append(", PHOTO=").append(PHOTO);
        sb.append(", CTIME=").append(CTIME);
        sb.append(", CONTENT=").append(CONTENT);
        sb.append(", DREAD=").append(DREAD);
        sb.append(", OWNER=").append(OWNER);
        sb.append("]");
        return sb.toString();
    }
}