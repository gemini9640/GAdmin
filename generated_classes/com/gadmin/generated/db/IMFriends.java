package com.gadmin.generated.db;

public class IMFriends {
    private String FRIENDS_ID;

    private String USERNAME;

    private String FUSERNAME;

    private String CTIME;

    private String ALLOW;

    private String FGROUP_ID;

    private String DTIME;

    private String BZ;

    public IMFriends(String FRIENDS_ID, String USERNAME, String FUSERNAME, String CTIME, String ALLOW, String FGROUP_ID, String DTIME, String BZ) {
        this.FRIENDS_ID = FRIENDS_ID;
        this.USERNAME = USERNAME;
        this.FUSERNAME = FUSERNAME;
        this.CTIME = CTIME;
        this.ALLOW = ALLOW;
        this.FGROUP_ID = FGROUP_ID;
        this.DTIME = DTIME;
        this.BZ = BZ;
    }

    public IMFriends() {
        super();
    }

    public String getFRIENDS_ID() {
        return FRIENDS_ID;
    }

    public void setFRIENDS_ID(String FRIENDS_ID) {
        this.FRIENDS_ID = FRIENDS_ID == null ? null : FRIENDS_ID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getFUSERNAME() {
        return FUSERNAME;
    }

    public void setFUSERNAME(String FUSERNAME) {
        this.FUSERNAME = FUSERNAME == null ? null : FUSERNAME.trim();
    }

    public String getCTIME() {
        return CTIME;
    }

    public void setCTIME(String CTIME) {
        this.CTIME = CTIME == null ? null : CTIME.trim();
    }

    public String getALLOW() {
        return ALLOW;
    }

    public void setALLOW(String ALLOW) {
        this.ALLOW = ALLOW == null ? null : ALLOW.trim();
    }

    public String getFGROUP_ID() {
        return FGROUP_ID;
    }

    public void setFGROUP_ID(String FGROUP_ID) {
        this.FGROUP_ID = FGROUP_ID == null ? null : FGROUP_ID.trim();
    }

    public String getDTIME() {
        return DTIME;
    }

    public void setDTIME(String DTIME) {
        this.DTIME = DTIME == null ? null : DTIME.trim();
    }

    public String getBZ() {
        return BZ;
    }

    public void setBZ(String BZ) {
        this.BZ = BZ == null ? null : BZ.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", FRIENDS_ID=").append(FRIENDS_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", FUSERNAME=").append(FUSERNAME);
        sb.append(", CTIME=").append(CTIME);
        sb.append(", ALLOW=").append(ALLOW);
        sb.append(", FGROUP_ID=").append(FGROUP_ID);
        sb.append(", DTIME=").append(DTIME);
        sb.append(", BZ=").append(BZ);
        sb.append("]");
        return sb.toString();
    }
}