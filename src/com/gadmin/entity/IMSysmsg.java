package com.gadmin.entity;

public class IMSysmsg {
    private String SYSMSG_ID;

    private String USERNAME;

    private String FROMUSERNAME;

    private String CTIME;

    private String REMARK;

    private String TYPE;

    private String CONTENT;

    private String ISDONE;

    private String DTIME;

    private String QGROUP_ID;

    private String DREAD;

    public IMSysmsg(String SYSMSG_ID, String USERNAME, String FROMUSERNAME, String CTIME, String REMARK, String TYPE, String CONTENT, String ISDONE, String DTIME, String QGROUP_ID, String DREAD) {
        this.SYSMSG_ID = SYSMSG_ID;
        this.USERNAME = USERNAME;
        this.FROMUSERNAME = FROMUSERNAME;
        this.CTIME = CTIME;
        this.REMARK = REMARK;
        this.TYPE = TYPE;
        this.CONTENT = CONTENT;
        this.ISDONE = ISDONE;
        this.DTIME = DTIME;
        this.QGROUP_ID = QGROUP_ID;
        this.DREAD = DREAD;
    }

    public IMSysmsg() {
        super();
    }

    public String getSYSMSG_ID() {
        return SYSMSG_ID;
    }

    public void setSYSMSG_ID(String SYSMSG_ID) {
        this.SYSMSG_ID = SYSMSG_ID == null ? null : SYSMSG_ID.trim();
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME == null ? null : USERNAME.trim();
    }

    public String getFROMUSERNAME() {
        return FROMUSERNAME;
    }

    public void setFROMUSERNAME(String FROMUSERNAME) {
        this.FROMUSERNAME = FROMUSERNAME == null ? null : FROMUSERNAME.trim();
    }

    public String getCTIME() {
        return CTIME;
    }

    public void setCTIME(String CTIME) {
        this.CTIME = CTIME == null ? null : CTIME.trim();
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK == null ? null : REMARK.trim();
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }

    public String getISDONE() {
        return ISDONE;
    }

    public void setISDONE(String ISDONE) {
        this.ISDONE = ISDONE == null ? null : ISDONE.trim();
    }

    public String getDTIME() {
        return DTIME;
    }

    public void setDTIME(String DTIME) {
        this.DTIME = DTIME == null ? null : DTIME.trim();
    }

    public String getQGROUP_ID() {
        return QGROUP_ID;
    }

    public void setQGROUP_ID(String QGROUP_ID) {
        this.QGROUP_ID = QGROUP_ID == null ? null : QGROUP_ID.trim();
    }

    public String getDREAD() {
        return DREAD;
    }

    public void setDREAD(String DREAD) {
        this.DREAD = DREAD == null ? null : DREAD.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", SYSMSG_ID=").append(SYSMSG_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", FROMUSERNAME=").append(FROMUSERNAME);
        sb.append(", CTIME=").append(CTIME);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", TYPE=").append(TYPE);
        sb.append(", CONTENT=").append(CONTENT);
        sb.append(", ISDONE=").append(ISDONE);
        sb.append(", DTIME=").append(DTIME);
        sb.append(", QGROUP_ID=").append(QGROUP_ID);
        sb.append(", DREAD=").append(DREAD);
        sb.append("]");
        return sb.toString();
    }
}