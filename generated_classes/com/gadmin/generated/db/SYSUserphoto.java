package com.gadmin.generated.db;

public class SYSUserphoto {
    private String USERPHOTO_ID;

    private String USERNAME;

    private String PHOTO0;

    private String PHOTO1;

    private String PHOTO2;

    private String PHOTO3;

    public SYSUserphoto(String USERPHOTO_ID, String USERNAME, String PHOTO0, String PHOTO1, String PHOTO2, String PHOTO3) {
        this.USERPHOTO_ID = USERPHOTO_ID;
        this.USERNAME = USERNAME;
        this.PHOTO0 = PHOTO0;
        this.PHOTO1 = PHOTO1;
        this.PHOTO2 = PHOTO2;
        this.PHOTO3 = PHOTO3;
    }

    public SYSUserphoto() {
        super();
    }

    public String getUSERPHOTO_ID() {
        return USERPHOTO_ID;
    }

    public void setUSERPHOTO_ID(String USERPHOTO_ID) {
        this.USERPHOTO_ID = USERPHOTO_ID == null ? null : USERPHOTO_ID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getPHOTO0() {
        return PHOTO0;
    }

    public void setPHOTO0(String PHOTO0) {
        this.PHOTO0 = PHOTO0 == null ? null : PHOTO0.trim();
    }

    public String getPHOTO1() {
        return PHOTO1;
    }

    public void setPHOTO1(String PHOTO1) {
        this.PHOTO1 = PHOTO1 == null ? null : PHOTO1.trim();
    }

    public String getPHOTO2() {
        return PHOTO2;
    }

    public void setPHOTO2(String PHOTO2) {
        this.PHOTO2 = PHOTO2 == null ? null : PHOTO2.trim();
    }

    public String getPHOTO3() {
        return PHOTO3;
    }

    public void setPHOTO3(String PHOTO3) {
        this.PHOTO3 = PHOTO3 == null ? null : PHOTO3.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", USERPHOTO_ID=").append(USERPHOTO_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", PHOTO0=").append(PHOTO0);
        sb.append(", PHOTO1=").append(PHOTO1);
        sb.append(", PHOTO2=").append(PHOTO2);
        sb.append(", PHOTO3=").append(PHOTO3);
        sb.append("]");
        return sb.toString();
    }
}